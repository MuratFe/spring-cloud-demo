package com.muratfe.masterdataservice.location.service;

import com.muratfe.masterdataservice.location.model.District;
import org.springframework.stereotype.Service;

@Service
public class DistrictService {
    public District getDistrict(int id) {
        return District.builder().id(id).name("District " + id).cityId(id).build();
    }
}
