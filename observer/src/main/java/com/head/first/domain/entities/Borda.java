package com.head.first.domain.entities;

import com.head.first.domain.enums.BordaSize;
import com.head.first.domain.enums.BordaType;

public class Borda {

    private final BordaType type;
    private final BordaSize size;

    public Borda(BordaType type, BordaSize size) {
        this.type = type;
        this.size = size;
    }

    public BordaType getType() {
        return type;
    }

    public BordaSize getSize() {
        return size;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((size == null) ? 0 : size.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Borda other = (Borda) obj;
        if (size != other.size)
            return false;
        if (type != other.type)
            return false;
        return true;
    }
}
