package com.example.SpareParts.repo;

import com.example.SpareParts.model.SpareParts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SparePartsRepo extends JpaRepository<SpareParts,Long> {
    List<SpareParts> findByRid(Long rid);

}
