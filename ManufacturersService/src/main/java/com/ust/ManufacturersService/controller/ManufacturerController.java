package com.ust.ManufacturersService.controller;


import com.ust.ManufacturersService.client.FullResponse;
import com.ust.ManufacturersService.model.Manufacturers;
import com.ust.ManufacturersService.service.ManufacturersService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manufacturers")
@RequiredArgsConstructor
public class ManufacturerController {
    @Autowired
    private final ManufacturersService manufacturersServicee;

    @PostMapping("/addmanufacturers")
    public Manufacturers addRetailers(@RequestBody Manufacturers manufacturersList)
    {
        return manufacturersServicee.addManufacturers(manufacturersList);
    }


    @GetMapping("/withretailers/{mid}")
    public ResponseEntity<FullResponse> findmanufacturersBymid(@PathVariable("mid") Long mid){
        return ResponseEntity.ok(manufacturersServicee.findbymid(mid));
    }
}
