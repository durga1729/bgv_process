package com.app.bgv.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {
    @JsonProperty("houseNumber")
    String houseNumber;

    @JsonProperty("street")
    String street;

    @JsonProperty("city")
    String city;

    @JsonProperty("pincode")
    String pincode;

    @JsonProperty("country")
    String country;

}
