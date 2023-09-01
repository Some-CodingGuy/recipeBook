package com.n.opensource.reddoit.model.entity;

import com.n.opensource.reddoit.model.dto.FoodTagDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class ImportantRecipeInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //private List<Ingredient> ingredientsList;
    // Ingredient substitutions (not MVP)
    // 1 corn starch == 1.3 potato starch
    private int minNeeded;
    private float difficulty;
    //private List<FoodTag> tags;

}
