package com.head.first.domain.entities;

public interface Observer<T> {
    
    void update(T value);
}
