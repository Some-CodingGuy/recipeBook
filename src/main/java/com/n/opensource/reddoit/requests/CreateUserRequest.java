package com.n.opensource.reddoit.requests;

import com.n.opensource.reddoit.model.entity.Recipe;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserRequest {
    public String username;
    public String email;
    public String password;
    public List<UUID> recipes;
}
