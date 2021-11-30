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
public class Education {
    @JsonProperty("hallTkt")
    String hallTkt;

    @JsonProperty("nameCollege")
    String nameCollege;

    @JsonProperty("nameUniversity")
    String nameUniversity;

    @JsonProperty("startYear")
    String startYear;

    @JsonProperty("lastYear")
    String lastYear;

    @JsonProperty("studyType")
    String studyType;

}
