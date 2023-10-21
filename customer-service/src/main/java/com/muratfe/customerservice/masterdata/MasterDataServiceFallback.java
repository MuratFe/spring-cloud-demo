package com.muratfe.customerservice.masterdata;

import com.muratfe.customerservice.masterdata.model.City;
import com.muratfe.customerservice.masterdata.model.District;
import org.springframework.stereotype.Component;

@Component
public class MasterDataServiceFallback implements MasterDataServiceClient {
    @Override
    public City getCity(int id) {
        return new City();
    }

    @Override
    public District getDistrict(int id) {
        return new District();
    }
}
