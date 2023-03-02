package com.dev.ecuzo_prj_dev.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Users {

    @GeneratedValue
    @Id
    private int id;
    private String userId;
    private String userPw;
    private String userNick;
    private String email;
    @Enumerated(EnumType.STRING)
    private Role roleType;

    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    private List<Orders> ordersList = new ArrayList<>();


}
