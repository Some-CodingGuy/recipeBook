package com.n.opensource.reddoit.model.dto;

import com.n.opensource.reddoit.model.entity.ImportantRecipeInfo;
import com.n.opensource.reddoit.model.entity.Ingredient;
import com.n.opensource.reddoit.model.entity.Rating;
import com.n.opensource.reddoit.model.entity.User;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecipeDTO {

    private String title;
    private ImportantRecipeInfo importantInfo;
    private String bodyContent;
    public List<Ingredient> ingredients;
    private User author;
    private boolean isOnline;
    private Date creationTime;
    private Date publishedTime;
    private List<Rating> ratings;
    // Add a banner for the post

}
