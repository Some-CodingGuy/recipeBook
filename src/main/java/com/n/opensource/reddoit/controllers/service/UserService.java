package com.n.opensource.reddoit.controllers.service;

import com.n.opensource.reddoit.model.dto.UserDTO;
import com.n.opensource.reddoit.model.entity.User;
import com.n.opensource.reddoit.model.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Getter
@AllArgsConstructor
public class UserService {

    final static Logger LOG = LoggerFactory.getLogger(UserService.class);

    private final UserRepository userRepository;

    public UserDTO createUser(UserDTO userDTO){
        User user = User.builder()
                .username(userDTO.getUsername())
                .email(userDTO.getEmail())
                .password(userDTO.getPassword())
                .build();
        userRepository.save(user);
        return userDTO;
    }

    public UserDTO getUserById(Integer userID){
        Optional<User> user = userRepository.findById(userID);
        return user.map(value -> UserDTO.builder()
                .username(value.getUsername())
                .email(value.getEmail())
                //.recipes(value.getRecipes())
                .build()).orElse(null);
    }

    public void deleteUser(Integer userID){
        Optional<User> user = userRepository.findById(userID);
        if (user.isPresent()){
            userRepository.delete(user.get());
            LOG.info("User with ID {} got deleted", user.get().getId());
        } else {
            LOG.error(String.format("User with id %i doesn't exist!", userID));
        }
    }
}
