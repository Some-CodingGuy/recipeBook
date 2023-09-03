package com.n.opensource.reddoit.requests;

import com.n.opensource.reddoit.model.entity.FoodTag;
import com.n.opensource.reddoit.model.entity.Ingredient;
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
public class CreateRecipeRequest {
        public String title;
        public String bodyContent;
        public boolean isOnline;
        public Date creationTime;
        public Date publishedTime;
        public ArrayList<FoodTag> foodTags;
        public ArrayList<Ingredient> ingredients;
}
