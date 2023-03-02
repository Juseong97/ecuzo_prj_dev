package com.dev.ecuzo_prj_dev.dto;

import com.dev.ecuzo_prj_dev.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class OrderDto {
    private int o_id;
    private String orderList;
    private int totalPrice;

    private List<Users> usersList;

}
