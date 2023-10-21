package com.muratfe.customerservice.customer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private int cityId;
    private String cityName;
    private int districtId;
    private String districtName;
}
