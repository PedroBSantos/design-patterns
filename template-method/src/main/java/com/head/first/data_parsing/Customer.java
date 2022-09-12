package com.head.first.data_parsing;

public class Customer {
    
    private String name;
    private String cpf;
    private String age;

    public Customer(String name, String age, String cpf) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }
}
