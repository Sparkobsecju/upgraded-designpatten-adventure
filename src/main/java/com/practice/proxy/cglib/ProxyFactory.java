package com.practice.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    /**
     * getInstance() 給目標物件 target 創建一個代理物件
     *
     * Override intercept() 方法，實作對被代理物件(目標)方法的呼叫
     */

    // 維護一個目標物件
    private Object target;

    // 建構子傳入一個被代理的物件
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 傳回一個代理物件，是 target 物件的代理物件
    public Object getProxyInstance() {
        // 1. 創建一個工具類別
        Enhancer enhancer = new Enhancer();
        // 2. 設置父類別
        enhancer.setSuperclass(target.getClass());
        // 3. 設置 Callback 函數
        enhancer.setCallback(this);
        // 4. 創建子類別物件，即代理物件
        return enhancer.create();
    }

    // Override intercept() 方法，會呼叫目標物件的方法
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式 ~~ 開始");
        Object returnVal = method.invoke(target, args);
        System.out.println("Cglib代理模式 ~~ 提交");
        return returnVal;
    }
}
