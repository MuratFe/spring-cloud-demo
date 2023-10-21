package com.muratfe.customerservice.masterdata.model;

import lombok.Data;

@Data
public class District {
    private int id;
    private String name;
    private City city;
}
