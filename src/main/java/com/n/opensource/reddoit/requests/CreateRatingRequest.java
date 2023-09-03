package com.n.opensource.reddoit.requests;

import com.n.opensource.reddoit.model.entity.Recipe;
import com.n.opensource.reddoit.model.entity.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateRatingRequest {

    private Integer rating;
    private User ratingFrom;
    private Recipe recipeRated;
}
