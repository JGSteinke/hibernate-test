package de.hibernate.test.data.model;

public interface Item<T extends Enum<T>> {
    T getType();
}
