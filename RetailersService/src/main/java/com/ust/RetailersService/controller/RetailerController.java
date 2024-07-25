package com.ust.RetailersService.controller;


import com.ust.RetailersService.client.FullResponse;
import com.ust.RetailersService.model.Retailers;
import com.ust.RetailersService.service.RetailerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/retailers")
@RequiredArgsConstructor
public class RetailerController {


    @Autowired
    private final RetailerService retailersService;

    @PostMapping("/addretailers")
    public Retailers addRetailers(@RequestBody Retailers retailersList)
    {
       return retailersService.addRetailers(retailersList);
    }


    @GetMapping("/withparts/{rid}")
    public ResponseEntity<FullResponse> findretailersByrid(@PathVariable("rid") Long rid){
        return ResponseEntity.ok(retailersService.findbyrid(rid));
    }
    @GetMapping("manufacturers/{mid}")
    public ResponseEntity<List<Retailers>> getManufacturersByMid(@PathVariable Long mid) {
        return ResponseEntity.ok(retailersService.getProductsByMid(mid));
    }
}
