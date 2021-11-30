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
public class Company {

    @JsonProperty("companyName")
    String companyName;

    @JsonProperty("empId")
    String empId;

    @JsonProperty("startDate")
    String startDate;

    @JsonProperty("lastDate")
    String lastDate;

    @JsonProperty("companyContact")
    String companyContact;

    @JsonProperty("companyEmail")
    String companyEmail;

    @JsonProperty("relievingManager")
    String relievingManager;

    @JsonProperty("designationOfManager")
    String designationOfManager;

    @JsonProperty("currentCtc")
    String currentCtc;

}
