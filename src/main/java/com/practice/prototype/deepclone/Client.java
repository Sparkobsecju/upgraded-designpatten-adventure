package com.practice.prototype.deepclone;

public class Client {

    public static void main(String[] args) throws Exception {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "宋江";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

        // 方式 1 完成深拷貝

//        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.clone();
//
//        System.out.println("Prototype.name = " + deepProtoType.name + "; Prototype.attrTarget = " + deepProtoType.deepCloneableTarget.hashCode());
//        System.out.println("Prototype2.name = " + deepProtoType.name + "; Prototype2.attrTarget = " + deepProtoType2.deepCloneableTarget.hashCode());


        // 方式 2 完成深拷貝
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println("Prototype.name = " + deepProtoType.name + "; Prototype.attrTarget = " + deepProtoType.deepCloneableTarget.hashCode());
        System.out.println("Prototype2.name = " + deepProtoType.name + "; Prototype2.attrTarget = " + deepProtoType2.deepCloneableTarget.hashCode());
    }
}
