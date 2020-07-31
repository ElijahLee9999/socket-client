# 安装

## java 
- 安装protoc编译器
> https://github.com/protocolbuffers/protobuf/releases
> 下载对应版本解压到本地路径
> 配置环境变量：
> 将protoc/bin配置到path环境变量
> 命令行
```
protoc --version 
```

- 编译
> Linux 下执行 proto.sh; Windows下执行proto.bat; 生成java文件到配置的路径(.proto文件里配置)

## 前端
- 安装 protobufjs
> proto 文件放在 /src/proto 目录。
> 运行以下命令
```
pbjs -t json-module -w commonjs -o src/proto/proto.js  src/proto/*.proto 
```
> 将生成proto.js
> 可以添加到了 package.json 中，直接运行 npm run protojs 也可以
>
> 上面的执行完成后，会在 src/proto 目录下生成 proto.js 文件，**由于 webpack 新版本的原因直接引入该文件会报错**
> [](https://github.com/protobufjs/protobuf.js/issues/1216)[Cannot assign to read only property'exports'of object' ](https://github.com/protobufjs/protobuf.js/issues/1216 "Cannot assign to read only property'exports'of object' ")
> **需要修改最后一行代码为**：`export default $root;`


```
import protoRoot from "@/proto/proto"
const WsReqProto = protoRoot.lookup("protocol.WsReqProto");
const WsRespProto = protoRoot.lookup("protocol.WsRespProto");
// 编码
function (payload) {
    // 加入登录验证
    payload.uid = parseInt(this.getUid());
    payload.token = this.getToken();
    console.log("发送的信息：");
    let errMsg = WsReqProto.verify(payload);
    console.log("buff 解析错误信息：", errMsg);
    // Create a new message
    const wsData = WsReqProto.create(payload); // or use .fromObject if conversion is necessary
    // Encode a message to an Uint8Array (browser) or Buffer (node)
    return WsReqProto.encode(wsData).finish();
}
// 解码
function (data, callback) {
    let reader = new FileReader();
    reader.readAsArrayBuffer(data);
    reader.onload = () => {
        const buf = new Uint8Array(reader.result);
        const response = WsRespProto.decode(buf);
        // 成功回调
        callback(response);
    };
}
```