package com.muratfe.masterdataservice.location.service;

import com.muratfe.masterdataservice.location.model.City;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    public City getCity(int id) {
        return City.builder().id(id).name("City " + id).build();
    }
}
