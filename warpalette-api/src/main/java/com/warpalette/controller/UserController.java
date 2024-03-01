package com.warpalette.controller;

import com.warpalette.entity.User;
import com.warpalette.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/users/{userId}/paints/{paintId}")
    public void addPaintToUser(Long userId, Long paintId) {
        userService.addPaintToUser(userId, paintId);
    }

    @DeleteMapping("/users/{userId}/paints/{paintId}")
    public void removePaintFromUser(Long userId, Long paintId) {
        userService.removePaintFromUser(userId, paintId);
    }

}
