package com.shuoxianren.baodan.entity;

import javax.persistence.*;
import lombok.Data;

@Table(name = "role_permission")
@Data
public class RolePermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "roleId")
    private Integer roleid;

    @Column(name = "permissionId")
    private Integer permissionid;
}