package com.ust.RetailersService.feign;

import com.ust.RetailersService.client.SpareParts;
import com.ust.RetailersService.model.Retailers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(name="SparePartsService", url="http://localhost:9098/spareparts")
public interface SparePartsClient {
    @GetMapping("retailers/{rid}")
    List<SpareParts> findProductsByRid(@PathVariable("rid") Long rid);


}
