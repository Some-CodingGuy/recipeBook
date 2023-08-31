package com.n.opensource.reddoit.controllers.service;

import com.n.opensource.reddoit.model.dto.IngredientDTO;
import com.n.opensource.reddoit.model.entity.Ingredient;
import com.n.opensource.reddoit.model.repository.IngredientRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IngredientService {

    @Autowired
    private final IngredientRepository ingredientRepository;
    @Autowired
    private final ModelMapper modelMapper;
    public IngredientDTO createIngredient(IngredientDTO ingredientDTO) {
        /*Ingredient ingredient = Ingredient.builder()
                .name(ingredientDTO.getName())
                .amount(ingredientDTO.getAmount())
                .measurements(ingredientDTO.getMeasurements())
                .build();
        ingredientRepository.save(ingredient);

        return ingredientDTO;*/
        Ingredient ingredient = modelMapper.map(ingredientDTO, Ingredient.class);
        System.out.println(ingredient);
        Ingredient savedIngredient = ingredientRepository.save(ingredient);
        return modelMapper.map(savedIngredient, IngredientDTO.class);
    }

}
