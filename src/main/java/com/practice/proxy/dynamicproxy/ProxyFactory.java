package com.practice.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    // 維護一個目標物件，Object
    private Object target;

    // 建構子，對 target 進行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 給目標物件 生成一個代理物件
    public Object getProxyInstance() {
        // 說明
        /**
         * public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)
         * // 1. ClassLoader loader: 指定當前物件使用的類別加載器，獲取加載器的方法固定
         * // 2. Class<?>[] interfaces: 目標物件實作的介面型態，使用犯行方法確認型態
         * // 3. InvocationHandler h: 事件處理，執行目標物件的方法時，會觸發事件處理器的方法，會把當前執行的目標物件方法作為參數傳入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理開始~~");
                        // 反射機制呼叫目標物件方法
                        Object returnVal = method.invoke(target, args);
                        System.out.println("JDK代理提交");
                        return returnVal;
                    }
                });
    }
}
