package com.shuoxianren.baodan.entity;

import javax.persistence.*;
import lombok.Data;

@Data
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String permission;
}