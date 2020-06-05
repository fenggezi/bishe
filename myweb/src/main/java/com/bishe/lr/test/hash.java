package com.bishe.lr.test;

import java.util.Objects;

public class hash {
    private int i;
    private String asd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        hash hash = (hash) o;
        return i == hash.i &&
                Objects.equals(asd, hash.asd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, asd);
    }
}
