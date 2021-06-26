package com.orange.meeting.dao.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;

    private String name;

    private RoleType role;

    private SexType sex;
}
