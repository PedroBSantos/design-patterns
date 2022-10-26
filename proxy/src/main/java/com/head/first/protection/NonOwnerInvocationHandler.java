package com.head.first.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {

    private PersonBean personBean;

    public NonOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().equals("setHotOrNotRating")) {
                return method.invoke(personBean, args);
            }
            if (method.getName().startsWith("set")) {
                throw new IllegalArgumentException();
            }
            return method.invoke(personBean, args);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
