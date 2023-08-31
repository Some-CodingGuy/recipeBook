package com.n.opensource.reddoit.model.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImportantInfoRecipeDTO {

    @Id
    private UUID id;
    // The ingredients will be an array of tuples first element being the quantity (to be chosen from the enum), second element being the ingredient itself
    //private List<> ingredientsList;
    // Ingredient substitutions (not MVP)
    // 1 corn starch == 1.3 potato starch
    private int minNeeded;
    private float difficulty;
    private List<FoodTagDTO> tags;
    @OneToOne
    private RecipeDTO recipe;
}
