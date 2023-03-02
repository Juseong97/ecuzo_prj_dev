package com.dev.ecuzo_prj_dev.controller;

import com.dev.ecuzo_prj_dev.dto.UserDto;
import com.dev.ecuzo_prj_dev.service.OrderService;
import com.dev.ecuzo_prj_dev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {

    private UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;

    }

    @PostMapping("test")
    public void UserAdd(@RequestBody UserDto userDto){
        userService.create(userDto);

    }

}
