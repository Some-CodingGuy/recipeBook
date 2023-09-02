package com.n.opensource.reddoit.controllers.api;

import com.n.opensource.reddoit.controllers.service.UserService;
import com.n.opensource.reddoit.model.dto.UserDTO;
import com.n.opensource.reddoit.requests.CreateUserRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    // createUser
    @PostMapping("/register")
    public ResponseEntity<UserDTO> createUser(@RequestBody CreateUserRequest createUserRequest){
        return ResponseEntity.ok(userService.createUser(createUserRequest));
    }

    // getUserByID
    @GetMapping("/getUser")
    public ResponseEntity<UserDTO> getUserByID(@RequestParam(name = "id") Long id){
        return ResponseEntity.ok(userService.getUserById(id));
    }

    // deleteUser
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteUser(@RequestParam(name = "id") Long id){
        userService.deleteUser(id);
        String response = "User has been deleted";
        return ResponseEntity.ok(response);
    }
}
