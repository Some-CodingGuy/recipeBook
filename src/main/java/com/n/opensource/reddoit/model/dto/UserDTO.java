package com.n.opensource.reddoit.model.dto;

import com.n.opensource.reddoit.model.entity.Rating;
import com.n.opensource.reddoit.model.entity.Recipe;
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
    private List<Rating> userRatings;

    // profile picture
}
