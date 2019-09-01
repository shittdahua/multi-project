package com.stone.multiproject.base;

import java.io.Serializable;

public class Pair extends Base {
    private static final long serialVersionUID = -3430123479637941814L;

    private Serializable key;
    private Serializable value;

    public static Pair of(Serializable key, Serializable value) {
        return new Pair(key, value);
    }

    public Pair() {
    }

    public Pair(Serializable key, Serializable value) {
        this.key = key;
        this.value = value;
    }

    public Serializable getKey() {
        return key;
    }

    public void setKey(Serializable key) {
        this.key = key;
    }

    public Serializable getValue() {
        return value;
    }

    public void setValue(Serializable value) {
        this.value = value;
    }
}
