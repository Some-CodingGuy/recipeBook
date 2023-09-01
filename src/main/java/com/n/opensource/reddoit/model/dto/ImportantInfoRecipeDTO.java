package com.n.opensource.reddoit.model.dto;

import com.n.opensource.reddoit.model.entity.FoodTag;
import com.n.opensource.reddoit.model.entity.Recipe;
import lombok.*;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImportantInfoRecipeDTO {

    // The ingredients will be an array of tuples first element being the quantity (to be chosen from the enum), second element being the ingredient itself
    //private List<> ingredientsList;
    // Ingredient substitutions (not MVP)
    // 1 corn starch == 1.3 potato starch
    private int minNeeded;
    private float difficulty;
    private List<FoodTag> tags;
    private Recipe recipe;
}
