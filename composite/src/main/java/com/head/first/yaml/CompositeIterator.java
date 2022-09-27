package com.head.first.yaml;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<YamlComponent> {

    private Stack<Iterator<YamlComponent>> stack;

    public CompositeIterator(Iterator<YamlComponent> iterator) {
        this.stack = new Stack<>();
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (this.stack.isEmpty()) {
            return false;
        }
        var topIterator = this.stack.peek();
        if (!topIterator.hasNext()) {
            this.stack.pop();
            return this.hasNext();
        }
        return true;
    }

    @Override
    public YamlComponent next() {
        if (!this.hasNext()) {
            return null;
        }
        var topIterator = this.stack.peek();
        var component = topIterator.next();
        if (component instanceof YamlSection) {
            this.stack.push(component.iterator());
        }
        return component;
    }
}
