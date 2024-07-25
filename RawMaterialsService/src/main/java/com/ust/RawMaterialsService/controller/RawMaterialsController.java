package com.ust.RawMaterialsService.controller;


import com.ust.RawMaterialsService.client.FullResponse;
import com.ust.RawMaterialsService.client.Manufacturers;
import com.ust.RawMaterialsService.model.RawMaterials;
import com.ust.RawMaterialsService.service.RawMaterialsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rawmaterials")
@RequiredArgsConstructor
public class RawMaterialsController {
    @Autowired
    private final RawMaterialsService rawMaterialsService;

    @PostMapping("/addrawmaterials")
    public RawMaterials addRawMaterials(@RequestBody RawMaterials rawMaterialslist)
    {
        return rawMaterialsService.addRawMaterials(rawMaterialslist);
    }


    @GetMapping("/withmanufacturers/{rmid}")
    public ResponseEntity<FullResponse> findrawmaterialsbyId(@PathVariable("rmid") Long rmid){
        return ResponseEntity.ok(rawMaterialsService.findbyrmid(rmid));
    }
}
