package com.ust.RawMaterialsService.feign;

import com.ust.RawMaterialsService.client.Manufacturers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="ManufacturersService", url="http://localhost:9100/manufacturers")
public interface ManufacturersClient {


    @GetMapping("rawmaterials/{rmid}")
    List<Manufacturers> findProductsByRmid(@PathVariable("rmid") Long rmid);
}
