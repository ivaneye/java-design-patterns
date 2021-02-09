package com.ivaneye.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ivaneye
 * @since 2021-02-09 10:42:28
 */
public class Consumer {

    private List<Provider> providerList = new ArrayList<>();

    /**
     * 更新Provider列表
     *
     * @param providerList
     */
    public void update(List<Provider> providerList) {
        this.providerList = providerList;
        System.out.println("Provider列表更新");
        providerList.forEach(it -> {
            System.out.println(it.info());
        });
    }
}
