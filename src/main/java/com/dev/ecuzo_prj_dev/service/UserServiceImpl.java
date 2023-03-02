package com.dev.ecuzo_prj_dev.service;

import com.dev.ecuzo_prj_dev.dto.UserDto;
import com.dev.ecuzo_prj_dev.entity.Users;
import com.dev.ecuzo_prj_dev.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void create(UserDto userDto) {
        System.out.println("userDto = " + userDto);
        Users users=UserDto.dtoToEntity(userDto);
        System.out.println("usersEntity = " + users);
        userRepository.save(users);
    }

    @Override
    public List<UserDto> userList() {
        return null;
    }
}
