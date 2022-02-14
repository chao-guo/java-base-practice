package com.practice.designpattern.abstractfactory;

public class Mi2S implements Telephone {
    @Override
    public void call(Long phoneNumber) {
        System.out.println("用小米2S打电话给：" + phoneNumber);
    }
}
