package com.cydeo.doublecolonoperator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {

    private String make;
    private  int modelYear;

    public Car(int modelYear) {
        this.modelYear = modelYear;
    }
}
