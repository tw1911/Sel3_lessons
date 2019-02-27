package ru.tw1911.sel3_lessons.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class Address {
    private String address;
    private String postcode;
    private String country;
    private String city;
}
