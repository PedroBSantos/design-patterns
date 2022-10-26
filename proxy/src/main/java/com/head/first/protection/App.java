package com.head.first.protection;

public class App {
    
    public static void main(String[] args) {
        var person = new PersonBeanImpl("Pedro", "M");
        var ownerProxy = OwnerProxy.getOnwerProxy(person);
        ownerProxy.setInterests("womans");
        ownerProxy.setHotOrNotRating(5);
    }
}
