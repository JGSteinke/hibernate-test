package de.hibernate.test.data.entity;

import de.hibernate.test.data.model.Item;
import jakarta.persistence.*;

@Entity
@Table(name = "item_a")
public class ItemA extends AbstractEntity implements Item<ItemA.Type> {
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "type", nullable = false)
    protected Type type;

    @Override
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    enum Type {
        A1, A2, A3;
    }
}
