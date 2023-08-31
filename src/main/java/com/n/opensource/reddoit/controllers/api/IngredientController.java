package com.n.opensource.reddoit.controllers.api;

import com.n.opensource.reddoit.controllers.service.IngredientService;
import com.n.opensource.reddoit.model.dto.IngredientDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ingredients")
@AllArgsConstructor
public class IngredientController {

    @Autowired
    private final IngredientService ingredientService;

    @PostMapping
    public ResponseEntity<IngredientDTO> createIngredient(@RequestBody IngredientDTO ingredientDTO) {
        IngredientDTO createdIngredient = ingredientService.createIngredient(ingredientDTO);
        return new ResponseEntity<>(createdIngredient, HttpStatus.CREATED);
    }
}
