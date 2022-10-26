package com.head.first.duck;

import com.head.first.QuackSubject;

public interface Quackable extends QuackSubject {
    
    void quack();

    @Override
    String toString();
}
