package com.ust.RetailersService.repo;

import com.ust.RetailersService.model.Retailers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface RetailerRepo extends JpaRepository<Retailers,Long> {
    Optional<Retailers> findByRid(Long rid);

    List<Retailers> findByMid(Long mid);
}
