package com.n.opensource.reddoit.requests;

import com.n.opensource.reddoit.model.entity.Recipe;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserRequest {
    public String username;
    public String email;
    public String password;
    public List<Recipe> recipes;
}
