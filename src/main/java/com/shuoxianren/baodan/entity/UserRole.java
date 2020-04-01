package com.shuoxianren.baodan.entity;

import javax.persistence.*;
import lombok.Data;

@Table(name = "user_role")
@Data
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "userId")
    private Integer userid;

    @Column(name = "roleId")
    private Integer roleid;
}