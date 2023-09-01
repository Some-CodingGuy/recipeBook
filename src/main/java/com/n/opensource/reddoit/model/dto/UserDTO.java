package com.n.opensource.reddoit.model.dto;

import com.n.opensource.reddoit.model.entity.Recipe;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private String username;
    private String email;
    private String password;
    private List<Recipe> recipes;

    // profile picture
}
