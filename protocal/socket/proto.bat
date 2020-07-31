set outPath=../../src/main/java
set fileArray=(UserInfo ExternalInfo ExternalList ExternalDel ExternalSave ExternalEdit UserMsg UserMsgSend UserMsgSync UserMsgSyncSave ExternalMsg ExternalMsgSave)

# 将.proto文件生成java类
for %%i in %fileArray% do (
    echo generate cli protocol java code: %%i.proto
    protoc --java_out=%outPath% ./%%i.proto
)

pause