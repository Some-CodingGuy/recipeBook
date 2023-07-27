package com.n.opensource.reddoit.controllers.service;

import com.n.opensource.reddoit.model.dto.UserDTO;
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
        return getUserRepository().save(userDTO);
    }

    public UserDTO getUserById(Integer userID){
        return getUserRepository().findById(userID).orElse(null);
    }

    public void deleteUser(Integer userID){
        Optional<UserDTO> user = getUserRepository().findById(userID);
        if (user.isPresent()){
            getUserRepository().delete(user.get());
            LOG.info("User with ID {} got deleted", user.get().getId());
        } else {
            LOG.error(String.format("User with id %i doesn't exist!", userID));
        }
    }
}
