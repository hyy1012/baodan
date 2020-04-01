package com.shuoxianren.baodan.entity;

import javax.persistence.*;
import lombok.Data;

@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String role;
}