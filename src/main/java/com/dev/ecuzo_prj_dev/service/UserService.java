package com.dev.ecuzo_prj_dev.service;

import com.dev.ecuzo_prj_dev.dto.UserDto;

import java.util.List;

public interface UserService {
    public void create(UserDto userDto);
    public List<UserDto> userList();
}
