package com.ust.ManufacturersService.feign;


import com.ust.ManufacturersService.client.Retailers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="RetailersService", url="http://localhost:9099/retailers")
public interface RetailersClient {
    @GetMapping("manufacturers/{mid}")
    List<Retailers> findProductsByMid(@PathVariable("mid") Long mid);
}
