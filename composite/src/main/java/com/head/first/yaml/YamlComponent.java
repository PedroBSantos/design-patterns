package com.head.first.yaml;

import java.util.Iterator;

public abstract class YamlComponent {
    
    public void addComponent(YamlComponent component) {
        throw new UnsupportedOperationException();
    }

    public void removeComponent(YamlComponent component) {
        throw new UnsupportedOperationException();
    }

    public abstract String getName();

    public String getValue() {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator<YamlComponent> iterator();

    public abstract String print(String struct);
}
