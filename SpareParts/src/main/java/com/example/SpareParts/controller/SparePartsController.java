package com.example.SpareParts.controller;


import com.example.SpareParts.model.SpareParts;
import com.example.SpareParts.service.SparePartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spareparts")
public class SparePartsController {
    @Autowired
   private SparePartsService sparePartsService;

   @GetMapping("/getparts")
    public List<SpareParts> getSpareParts() {
       return sparePartsService.getSpareParts();
    }

    @PostMapping("/addpart")
    public SpareParts addSpareParts(@RequestBody SpareParts spareParts) {
       return sparePartsService.addSpareParts(spareParts);
    }

    @GetMapping("retailers/{rid}")
    public ResponseEntity<List<SpareParts>> getProductsByRid(@PathVariable Long rid) {
        return ResponseEntity.ok(sparePartsService.getProductsByRid(rid));
    }
}
