package com.avecherov;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class People {
    @Builder.Default
    public final String GREET = "hello";
    private int age;
    private String name;
    private String lastName;
    private String city;
    private String job;
    private static StringBuilder builder;

    public String greet() {
        return getGREET() + " my name is " + getName();
    }
}