package com.dev.ecuzo_prj_dev.dto;

import com.dev.ecuzo_prj_dev.entity.Orders;
import com.dev.ecuzo_prj_dev.entity.Role;
import com.dev.ecuzo_prj_dev.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

    private int id;
    private String userId;
    private String userPw;
    private String userNick;
    private String email;

    private Role roleType;

    private List<Orders> orderList;


    public static UserDto entityToDto(Users users){
        return new UserDto(users.getId(), users.getUserId(), users.getUserPw(), users.getUserNick(),
        users.getEmail(), users.getRoleType(),users.getOrdersList());
    }

    public static Users dtoToEntity(UserDto userDto){
        return  new Users(userDto.getId(),userDto.getUserId(),userDto.getUserPw(), userDto.getUserNick(),
                userDto.getEmail(),userDto.getRoleType(),userDto.getOrderList());
    }
}
