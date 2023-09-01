package com.n.opensource.reddoit.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Recipe {
    @Id
    private UUID id;
    private String title;
    //private ImportantRecipeInfo importantInfo;
    private String bodyContent;
    private boolean isOnline = true;
    private Date creationTime = new Date();
    private Date publishedTime = new Date();
    //private ArrayList<FoodTag> foodTags;
}
