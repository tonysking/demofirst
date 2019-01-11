package com.springboot.demofirst.enums;

import lombok.Getter;

@Getter
public enum UserSexEnum {
    MALE(1,"男"),
    FEMALE(2,"女")
    ;
    private Integer index;

    private String name;

    UserSexEnum(Integer index, String name) {
        this.index = index;
        this.name = name;
    }
}
