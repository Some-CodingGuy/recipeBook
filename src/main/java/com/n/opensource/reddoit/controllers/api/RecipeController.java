package com.n.opensource.reddoit.controllers.api;

import com.n.opensource.reddoit.controllers.service.RecipeService;
import com.n.opensource.reddoit.model.dto.RecipeDTO;
import com.n.opensource.reddoit.model.entity.Recipe;
import com.n.opensource.reddoit.requests.CreateRecipeRequest;
import com.n.opensource.reddoit.requests.SetRecipeFoodTagsRequest;
import com.n.opensource.reddoit.requests.SetRecipeIngredientsRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/api/v1/recipe")
@AllArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;

    @PostMapping("/create")
    public ResponseEntity<RecipeDTO> createRecipe(@RequestBody CreateRecipeRequest createRecipeRequest) {
        return ResponseEntity.ok(recipeService.createRecipe(createRecipeRequest));
    }

    @GetMapping("/getPost")
    public ResponseEntity<RecipeDTO> getRecipeById(@RequestParam(name = "id") UUID recipeId) {
        return ResponseEntity.ok(recipeService.getRecipeById(recipeId));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteRecipe(@RequestParam(name = "id") UUID recipeId) {
        recipeService.deleteRecipe(recipeId);
        String response = "Recipe has been deleted";
        return ResponseEntity.ok(response);
    }

    @PostMapping("/banner/{id}")
    public ResponseEntity<Recipe> setRecipeBanner(@PathVariable UUID id, @RequestParam("file") MultipartFile file) {
        try {
            Recipe recipe = recipeService.setRecipeBanner(id, file);
            return ResponseEntity.status(HttpStatus.CREATED).body(recipe);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PostMapping("/foodtags/{id}")
    public ResponseEntity<Recipe> setRecipeFoodTags(@PathVariable UUID id, @RequestParam SetRecipeFoodTagsRequest setRecipeFoodTagsRequest) {
        try {
            Recipe recipe = recipeService.setRecipeFoodTags(id, setRecipeFoodTagsRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body(recipe);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PostMapping("/ingredients/{id}")
    public ResponseEntity<Recipe> setRecipeIngredients(@PathVariable UUID id, @RequestParam SetRecipeIngredientsRequest setRecipeFoodTagsRequest) {
        try {
            Recipe recipe = recipeService.setRecipeIngredients(id, setRecipeFoodTagsRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body(recipe);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
