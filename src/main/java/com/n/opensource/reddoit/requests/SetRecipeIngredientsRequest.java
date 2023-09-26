package com.n.opensource.reddoit.requests;

import com.n.opensource.reddoit.model.entity.Ingredient;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SetRecipeIngredientsRequest {
    List<Ingredient> recipeIngredients;
}