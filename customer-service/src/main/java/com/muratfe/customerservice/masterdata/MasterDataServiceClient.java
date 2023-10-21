package com.muratfe.customerservice.masterdata;

import com.muratfe.customerservice.masterdata.model.City;
import com.muratfe.customerservice.masterdata.model.District;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "master-data-service", fallback = MasterDataServiceFallback.class)
public interface MasterDataServiceClient {
    @GetMapping("/city/{id}")
    City getCity(@PathVariable int id);

    @GetMapping("/district/{id}")
    District getDistrict(@PathVariable int id);
}
