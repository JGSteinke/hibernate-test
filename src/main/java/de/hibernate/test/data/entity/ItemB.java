package de.hibernate.test.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_b")
public class ItemB extends AbstractItem<ItemB.Type> {
    enum Type {
        B1, B2, B3;
    }
}
