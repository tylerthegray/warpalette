package com.warpalette.service;

import com.warpalette.entity.User;
import com.warpalette.exceptions.BadRequestException;
import com.warpalette.repository.PaintRepository;
import com.warpalette.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PaintRepository paintRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void addPaintToUser(Long userId, Long paintId) {
        var paint = paintRepository.findById(paintId).orElseThrow(() -> new BadRequestException("Paint with id {" + paintId + "} not found"));
        var user = userRepository.findById(userId).orElseThrow(() -> new BadRequestException("User with id {" + userId + "} not found"));
        user.getPaints().add(paint);
        userRepository.save(user);
    }

    public void removePaintFromUser(Long userId, Long paintId) {
        var paint = paintRepository.findById(paintId).orElseThrow(() -> new BadRequestException("Paint with id {" + paintId + "} not found"));
        var user = userRepository.findById(userId).orElseThrow(() -> new BadRequestException("User with id {" + userId + "} not found"));
        user.getPaints().remove(paint);
        userRepository.save(user);
    }

}
