#!/bin/bash

outPath=../../src/main/java
fileArray=(UserInfo ExternalInfo ExternalList ExternalDel ExternalSave ExternalEdit UserMsg UserMsgSend UserMsgSync UserMsgSyncSave ExternalMsg ExternalMsgSave)

for i in ${fileArray[@]};
do
    echo "generate cli protocol java code: ${i}.proto"
    protoc --java_out=$outPath ./$i.proto
done
