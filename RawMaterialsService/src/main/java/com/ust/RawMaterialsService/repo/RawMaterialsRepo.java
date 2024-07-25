package com.ust.RawMaterialsService.repo;


import com.ust.RawMaterialsService.model.RawMaterials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RawMaterialsRepo extends JpaRepository<RawMaterials,Long> {

    Optional<RawMaterials> findByRmid(Long mid);
}
