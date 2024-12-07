package com.cydeo.comparatorinterface;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Apple {

    private Color color;
    private int weight;

}
