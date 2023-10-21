package com.muratfe.masterdataservice.rest.controller;

import com.muratfe.masterdataservice.location.model.City;
import com.muratfe.masterdataservice.location.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/city")
public class CityController {
    private final CityService cityService;

    @GetMapping("/{id}")
    public City getCity(@PathVariable int id) {
        return cityService.getCity(id);
    }
}
