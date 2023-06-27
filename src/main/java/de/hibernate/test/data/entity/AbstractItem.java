package de.hibernate.test.data.entity;

import de.hibernate.test.data.model.Item;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractItem<T extends Enum<T>> extends AbstractEntity implements Item<T> {
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "type", nullable = false)
    protected T type;

    @Override
    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

}
