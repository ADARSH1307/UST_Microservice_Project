package com.ust.ManufacturersService.service;

import com.ust.ManufacturersService.client.FullResponse;
import com.ust.ManufacturersService.client.Retailers;
import com.ust.ManufacturersService.feign.RetailersClient;
import com.ust.ManufacturersService.model.Manufacturers;
import com.ust.ManufacturersService.repo.ManufacturersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturersService {

    @Autowired
    private ManufacturersRepo repo;

    @Autowired
    private RetailersClient client;
    public Manufacturers addManufacturers(Manufacturers manufacturersList) {

        return repo.save(manufacturersList);
    }



    public FullResponse findbymid(Long mid) {

        Manufacturers c =  repo.findByMid(mid).orElse(null);
        List<Retailers> list=client.findProductsByMid(mid);
        FullResponse res= new FullResponse();
        res.setMid(c.getMid());
        res.setMname(c.getMname());
        res.setList(list);
        res.setMaddress(c.getMaddress());
        res.setMno(c.getMno());
        return res;

    }

    public List<Manufacturers> getProductsByRMid(Long rmid) {
        return repo.findByRmid(rmid);
    }
}
