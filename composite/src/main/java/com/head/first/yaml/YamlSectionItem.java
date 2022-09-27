package com.head.first.yaml;

import java.util.Iterator;

public class YamlSectionItem extends YamlComponent {

    private YamlComponent fatherSection;
    private String name;
    private String value;
    private String prefix;

    public YamlSectionItem(YamlComponent fatherSection, String name, String value, String prefix) {
        this.fatherSection = fatherSection;
        this.name = name;
        this.value = value;
        this.prefix = prefix;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public Iterator<YamlComponent> iterator() {
        return new LeafIterator();
    }

    @Override
    public String print(String struct) {
        return this.fatherSection != null ? struct + prefix + name + ": " + value : prefix + name + ": " + value;
    }
}
