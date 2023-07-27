package com.n.opensource.reddoit.controllers.api;

import com.n.opensource.reddoit.controllers.service.UserService;
import com.n.opensource.reddoit.model.dto.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    // createUser
    @PostMapping("/register")
    public ResponseEntity<UserDTO> createUser(UserDTO userDTO){

        return ResponseEntity.ok(userService.createUser(userDTO));
    }

    // getUserByID
    @GetMapping("/getUser")
    public ResponseEntity<UserDTO> getUserByID(@RequestParam(name = "id") Integer id){
        return ResponseEntity.ok(userService.getUserById(id));
    }

    // deleteUser
    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteUser(@RequestParam(name = "id") Integer id){
        userService.deleteUser(id);
        Void void2 = null;
        return ResponseEntity.ok(void2);
    }
}
