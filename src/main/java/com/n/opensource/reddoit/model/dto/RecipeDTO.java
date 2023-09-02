package com.n.opensource.reddoit.model.dto;

import com.n.opensource.reddoit.model.entity.ImportantRecipeInfo;
import lombok.*;
import java.util.Date;

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

    // Add a banner for the post

}
