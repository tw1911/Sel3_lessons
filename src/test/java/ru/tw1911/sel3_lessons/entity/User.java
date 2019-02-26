package ru.tw1911.sel3_lessons.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class User {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Address address;
}
