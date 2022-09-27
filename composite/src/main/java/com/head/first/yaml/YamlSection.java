package com.head.first.yaml;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class YamlSection extends YamlComponent {

    private YamlComponent fatherSection;
    private String name;
    private List<YamlComponent> components;
    private Iterator<YamlComponent> iterator;
    private String prefix;

    public YamlSection(String name, YamlComponent fatherSection, String prefix) {
        this.name = name;
        this.components = new ArrayList<>();
        this.fatherSection = fatherSection;
        this.prefix = prefix;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addComponent(YamlComponent component) {
        this.components.add(component);
    }

    @Override
    public void removeComponent(YamlComponent component) {
        this.components.remove(component);
    }

    @Override
    public Iterator<YamlComponent> iterator() {
        if (this.iterator == null) {
            this.iterator = new CompositeIterator(this.components.iterator());
        }
        return this.iterator;
    }

    @Override
    public String print(String struct) {
        var string = this.fatherSection == null ? prefix + name + ":" : struct + prefix + name + ":";
        for (var yamlComponent : components) {
            string = string + "\n" + yamlComponent.print(this.fatherSection == null ? struct : struct + struct);
        }
        return string;
    }
}
