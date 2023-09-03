package com.n.opensource.reddoit.model.dto;

import com.n.opensource.reddoit.model.entity.ImportantRecipeInfo;
import com.n.opensource.reddoit.model.entity.Ingredient;
import lombok.*;

import java.util.ArrayList;
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
    private boolean isOnline;
    private Date creationTime;
    private Date publishedTime;
    public List<Ingredient> ingredients;
    // Add a banner for the post

}
