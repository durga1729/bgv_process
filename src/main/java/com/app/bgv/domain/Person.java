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
public class Person {

    @JsonProperty("firstName")
    String firstName;

    @JsonProperty("lastName")
    String lastName;

    @JsonProperty("mobileNumber")
    String mobileNumber;

    @JsonProperty("emailId")
    String emailId;

    @JsonProperty("panCard")
    String panCare;

    @JsonProperty("aadharCard")
    String aadharCard;
}
