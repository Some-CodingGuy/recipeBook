package com.n.opensource.reddoit.model.dto;

import com.n.opensource.reddoit.model.entity.Recipe;
import com.n.opensource.reddoit.model.entity.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RatingDTO {

    private Integer rating;
    private User ratingFrom;
    private Recipe recipeRated;
}
