package com.muratfe.customerservice.customer.service;

import com.muratfe.customerservice.customer.model.Customer;
import com.muratfe.customerservice.masterdata.MasterDataServiceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final MasterDataServiceClient masterDataServiceClient;
    public Customer getCustomer(int id) {
        var customer = Customer.builder()
                .id(id)
                .name("Customer Name " + id)
                .surname("Customer Surname " + id)
                .phone("Customer Phone " + id)
                .email("Customer Email " + id)
                .cityId(1)
                .districtId(1)
                .build();
        var city = masterDataServiceClient.getCity(customer.getCityId());
        customer.setCityName(city.getName());
        var district = masterDataServiceClient.getDistrict(customer.getDistrictId());
        customer.setDistrictName(district.getName());
        return customer;
    }
}
