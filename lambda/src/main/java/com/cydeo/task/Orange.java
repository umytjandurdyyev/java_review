package com.cydeo.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder // can create instance easily and generates an @AllArgsConstructor unless is another @XConstructor
public class Orange {
    private int weight;
    private Color color;
}
