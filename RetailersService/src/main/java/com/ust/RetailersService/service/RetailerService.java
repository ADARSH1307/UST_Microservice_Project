package com.ust.RetailersService.service;

import com.ust.RetailersService.client.FullResponse;
import com.ust.RetailersService.client.SpareParts;
import com.ust.RetailersService.feign.SparePartsClient;
import com.ust.RetailersService.model.Retailers;
import com.ust.RetailersService.repo.RetailerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetailerService {

    @Autowired
    private RetailerRepo repo;

    @Autowired
    private SparePartsClient client;
    public Retailers addRetailers(Retailers retailersList) {

      return repo.save(retailersList);
    }



    public FullResponse findbyrid(Long rid) {

            Retailers c=  repo.findByRid(rid).orElse(null);
            List<SpareParts> list=client.findProductsByRid(rid);
            FullResponse res= new FullResponse();
            res.setRid(c.getRid());
            res.setRname(c.getRname());
            res.setRaddress(c.getRaddress());
            res.setRphone(c.getRphone());
            res.setMid(c.getMid());
            res.setParts(list);


            return res;

    }

    public List<Retailers> getProductsByMid(Long mid) {
        return repo.findByMid(mid);
    }
}
