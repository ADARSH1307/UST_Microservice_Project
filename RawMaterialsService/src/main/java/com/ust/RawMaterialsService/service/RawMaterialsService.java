package com.ust.RawMaterialsService.service;

import com.ust.RawMaterialsService.client.FullResponse;
import com.ust.RawMaterialsService.client.Manufacturers;
import com.ust.RawMaterialsService.feign.ManufacturersClient;
import com.ust.RawMaterialsService.model.RawMaterials;
import com.ust.RawMaterialsService.repo.RawMaterialsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RawMaterialsService {
    @Autowired
    private RawMaterialsRepo repo;

    @Autowired
    private ManufacturersClient client;
    public RawMaterials addRawMaterials(RawMaterials rawmaterialsList) {

        return repo.save(rawmaterialsList);
    }



    public FullResponse findbyrmid(Long rmid) {

        RawMaterials c =  repo.findByRmid(rmid).orElse(null);
        List<Manufacturers> list=client.findProductsByRmid(rmid);
        FullResponse res= new FullResponse();
        res.setRmid(c.getRmid());
        res.setRmname(c.getRmname());
        res.setList(list);
        res.setRmaddress(c.getRmaddress());
        res.setRmphone(c.getRmphone());
        return res;

    }
}
