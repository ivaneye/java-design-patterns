package com.ivaneye.observer;

/**
 * @author ivaneye
 * @since 2021-02-09 10:53:49
 */
public class Main {

    public static void main(String[] args) {
        Registry reg = new Registry();
        Consumer consumer = new Consumer();
        // 消费端订阅（监听）
        reg.subscribe(consumer);
        // 生产端注册
        Provider providerA = new ProviderA();
        reg.regist(providerA);
        // 生产端注册
        Provider providerB = new ProviderB();
        reg.regist(providerB);
    }
}
