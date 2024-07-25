package com.ust.ManufacturersService.repo;

import com.ust.ManufacturersService.model.Manufacturers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Repository
public interface ManufacturersRepo extends JpaRepository<Manufacturers,Long> {
    Optional<Manufacturers> findByMid(Long mid);

    List<Manufacturers> findByRmid(Long rmid);
}
