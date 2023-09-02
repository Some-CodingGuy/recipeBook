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

    public String username;
    public String email;
    public List<Recipe> recipes;

    // profile picture
}
