package com.n.opensource.reddoit.controllers.service;

import com.n.opensource.reddoit.model.dto.RecipeDTO;
import com.n.opensource.reddoit.model.repository.RecipeRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class RecipeService {

    final static Logger LOG = LoggerFactory.getLogger(RecipeService.class);

    private final RecipeRepository recipeRepository;

    public RecipeDTO createRecipe(RecipeDTO recipeDTO){
        return recipeRepository.save(recipeDTO);
    }

    public RecipeDTO getRecipeById(UUID recipeId){
        return recipeRepository.findById(recipeId).orElse(null);
    }

    public void deleteRecipe (UUID recipeId){
        Optional<RecipeDTO> recipe = recipeRepository.findById(recipeId);
        if (recipe.isPresent()){
            recipeRepository.delete(recipe.get());
            //LOG.info("Recipe with ID {} got deleted", recipe.get().getId());
        } else {
            LOG.error(String.format("Recipe with id %i doesn't exist!", recipeId));
        }
    }

}
