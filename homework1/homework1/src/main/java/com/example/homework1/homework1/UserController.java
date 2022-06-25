package com.example.homework1.homework1;

import com.example.homework1.homework1.dao.UserDao;
import com.example.homework1.homework1.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserDao userDao;

    @PostMapping
    public User save(@RequestBody User user) {
        return userDao.save(user);
    }


}