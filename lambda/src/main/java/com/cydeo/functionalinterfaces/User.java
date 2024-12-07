package com.cydeo.functionalinterfaces;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
//@NoArgsConstructor
@Data
@Builder
public class User {

    private String firstname;
    private String lastname;
    private int age;

}
