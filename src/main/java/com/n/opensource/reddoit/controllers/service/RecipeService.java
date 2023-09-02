package com.n.opensource.reddoit.controllers.service;

import com.n.opensource.reddoit.model.dto.RecipeDTO;
import com.n.opensource.reddoit.model.dto.UserDTO;
import com.n.opensource.reddoit.model.entity.Ingredient;
import com.n.opensource.reddoit.model.entity.Recipe;
import com.n.opensource.reddoit.model.entity.User;
import com.n.opensource.reddoit.model.enums.Measurements;
import com.n.opensource.reddoit.model.repository.RecipeRepository;
import com.n.opensource.reddoit.requests.CreateRecipeRequest;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
public class RecipeService {

    final static Logger LOG = LoggerFactory.getLogger(RecipeService.class);

    private final RecipeRepository recipeRepository;
    private final ModelMapper modelMapper;
    public RecipeDTO createRecipe(CreateRecipeRequest createRecipeRequest){
        Recipe recipe = modelMapper.map(createRecipeRequest, Recipe.class);
        recipe.setId(UUID.randomUUID());
        recipe.setOnline(true);
        recipe.setCreationTime(new Date());
        recipe.setPublishedTime(new Date());
        return modelMapper.map(recipeRepository.save(recipe), RecipeDTO.class);
    }

    public RecipeDTO getRecipeById(UUID recipeId){
        Optional<Recipe> user = recipeRepository.findById(recipeId);
        return user.map(value -> RecipeDTO.builder()
                .title(value.getTitle())
                //.importantInfo(value.getImportantInfo())
                .bodyContent(value.getBodyContent())
                .isOnline(value.isOnline())
                .creationTime(value.getCreationTime())
                .publishedTime(value.getPublishedTime())
                .build()).orElse(null);
    }

    public void deleteRecipe (UUID recipeId){
        Optional<Recipe> recipe = recipeRepository.findById(recipeId);
        if (recipe.isPresent()){
            recipeRepository.delete(recipe.get());
            //LOG.info("Recipe with ID {} got deleted", recipe.get().getId());
        } else {
            LOG.error(String.format("Recipe with id %i doesn't exist!", recipeId));
        }
    }

}
