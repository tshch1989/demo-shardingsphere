package com.example.demoshardingsphere.infrastructure.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private long userId;

    private String userName;

    private String userNamePlain;

    private String pwd;

    private String assistedQueryPwd;
}
