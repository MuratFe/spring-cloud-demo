package com.muratfe.masterdataservice.rest.controller;

import com.muratfe.masterdataservice.location.model.District;
import com.muratfe.masterdataservice.location.service.DistrictService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/district")
public class DistrictController {
    private final DistrictService districtService;

    @GetMapping("/{id}")
    public District getDistrict(@PathVariable int id) {
        return districtService.getDistrict(id);
    }
}
