package com.muratfe.masterdataservice.location.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class District {
    private int id;
    private String name;
    private int cityId;
}
