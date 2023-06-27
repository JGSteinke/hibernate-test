package de.hibernate.test.data.service;

import de.hibernate.test.data.entity.ItemA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemARepository extends JpaRepository<ItemA, Long>, JpaSpecificationExecutor<ItemA> {
    @Query("SELECT a FROM ItemA a WHERE a.type < 1")
    List<ItemA> findAllByTypeA2();
}
