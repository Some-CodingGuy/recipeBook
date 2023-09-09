package com.n.opensource.reddoit.controllers.api;

import com.n.opensource.reddoit.controllers.service.RecipeService;
import com.n.opensource.reddoit.model.dto.RecipeDTO;
import com.n.opensource.reddoit.requests.CreateRecipeRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/api/v1/recipe")
@AllArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;

    @PostMapping("/create")
    public ResponseEntity<RecipeDTO> createRecipe(@RequestBody CreateRecipeRequest createRecipeRequest){
        return ResponseEntity.ok(recipeService.createRecipe(createRecipeRequest));
    }

    @GetMapping("/getPost")
    public ResponseEntity<RecipeDTO> getRecipeById(@RequestParam(name = "id")UUID recipeId){
        return ResponseEntity.ok(recipeService.getRecipeById(recipeId));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteRecipe(@RequestParam(name = "id")UUID recipeId){
        recipeService.deleteRecipe(recipeId);
        String response = "Recipe has been deleted";
        return ResponseEntity.ok(response);
    }
}
