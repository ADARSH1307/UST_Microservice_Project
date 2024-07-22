package com.ust.RetailersService.repo;

import com.ust.RetailersService.client.SpareParts;
import com.ust.RetailersService.model.Retailers;
import jdk.jfr.Registered;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface RetailerRepo extends JpaRepository<Retailers,Long> {
    Optional<Retailers> findByRid(Long rid);

    List<Retailers> findbyMid(Long mid);
}
