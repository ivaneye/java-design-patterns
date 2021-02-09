package com.ivaneye.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 注册中心(Subject)
 *
 * @author ivaneye
 * @since 2021-02-09 10:41:23
 */
public class Registry {

    // Observer
    private List<Consumer> consumerList = new ArrayList();
    // 状态
    private List<Provider> providerList = new ArrayList();

    /**
     * 消费端订阅
     *
     * @param consumer
     */
    public void subscribe(Consumer consumer) {
        consumerList.add(consumer);
    }

    /**
     * 生产端注册
     * @param provider
     */
    public void regist(Provider provider) {
        providerList.add(provider);
        this.notifyConsumer();
    }

    private void notifyConsumer() {
        consumerList.forEach(it -> {
            it.update(providerList);
        });
    }

}
