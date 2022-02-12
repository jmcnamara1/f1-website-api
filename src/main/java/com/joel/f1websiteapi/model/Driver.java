package com.joel.f1websiteapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Driver {

    private String driverId;
    private String givenName;
    private String familyName;
    private String dateOfBirth;
    private String nationality;
    private String code;
    private String url;



}
