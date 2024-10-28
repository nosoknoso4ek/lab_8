package ru.barmina.SpringBootEducation.service;

import ru.barmina.SpringBootEducation.dto.UserDto;
import ru.barmina.SpringBootEducation.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
