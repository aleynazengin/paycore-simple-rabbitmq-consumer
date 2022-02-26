package com.patika.paycorerabbitmqconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable {
    private String nationalId;
    private String firstname;
    private String lastname;
    private int monthlyIncome;
    private String phone;
}
