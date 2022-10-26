package com.head.first.protection;

import java.lang.reflect.Proxy;

public class NonOwnerProxy {
    
    public static PersonBean getOnwerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(
            personBean.getClass().getClassLoader(), 
            personBean.getClass().getInterfaces(),
            new NonOwnerInvocationHandler(personBean));
    }
}
