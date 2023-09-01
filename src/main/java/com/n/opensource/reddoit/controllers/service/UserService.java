package com.n.opensource.reddoit.controllers.service;

import com.n.opensource.reddoit.model.dto.UserDTO;
import com.n.opensource.reddoit.model.entity.User;
import com.n.opensource.reddoit.model.repository.UserRepository;
import com.n.opensource.reddoit.requests.CreateUserRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.modelmapper.ModelMapper;
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
    private ModelMapper modelMapper;
    public UserDTO createUser(CreateUserRequest createUserRequest) {
        User user = modelMapper.map(createUserRequest, User.class);
        User savedUserDTO = userRepository.save(user);
        return modelMapper.map(savedUserDTO, UserDTO.class);
    }

    public UserDTO getUserById(Long userID){
        Optional<User> user = userRepository.findById(userID);
        return user.map(value -> UserDTO.builder()
                .username(value.getUsername())
                .email(value.getEmail())
                //.recipes(value.getRecipes())
                .build()).orElse(null);
    }

    public void deleteUser(Long userID){
        Optional<User> user = userRepository.findById(userID);
        if (user.isPresent()){
            userRepository.delete(user.get());
            LOG.info("User with ID {} got deleted", user.get().getId());
        } else {
            LOG.error(String.format("User with id %i doesn't exist!", userID));
        }
    }
}
