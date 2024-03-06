package com.practice.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {

    public String name; // String 屬性
    public DeepCloneableTarget deepCloneableTarget; // 引用型態
    public DeepProtoType() {
        super();
    }


    // 深拷貝 - 方式 1 使用 clone() 方法

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object deep = null;
        // 這裡完成對基本資料型態(屬性)和 String 的複製
        deep = super.clone();
        // 對引用型態的屬性，進行單獨處理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deep;
    }


    // 深拷貝 - 方式 2 通過物件的序列化實現 (推薦)
    public Object deepClone() {

        // 創建物件流
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {

            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // 當前這個物件以物件流的方式輸出

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();

            return copyObj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            // 關閉流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
    }
}
