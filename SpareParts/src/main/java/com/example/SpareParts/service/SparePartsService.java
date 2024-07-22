package com.example.SpareParts.service;

import com.example.SpareParts.model.SpareParts;
import com.example.SpareParts.repo.SparePartsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SparePartsService {

    @Autowired
    private SparePartsRepo repo;
    public List<SpareParts> getSpareParts() {
        return repo.findAll();
    }


    public SpareParts addSpareParts(SpareParts spareParts) {

        return repo.save(spareParts);
    }

    public List<SpareParts> getProductsByRid(Long rid) {

            return repo.findByRid(rid);
        }

}
