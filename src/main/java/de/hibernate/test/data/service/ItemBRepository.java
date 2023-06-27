package de.hibernate.test.data.service;

import de.hibernate.test.data.entity.ItemB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemBRepository extends JpaRepository<ItemB, Long>, JpaSpecificationExecutor<ItemB> {
    @Query("SELECT b FROM ItemB b WHERE b.type < 1")
    List<ItemB> findAllByTypeB2();
}
