package com.dev.ecuzo_prj_dev.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Orders {

    @Id
    private int id;

    @Lob
    private String Content;
    private int totalPrice;

    private String tableNum;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;
}


