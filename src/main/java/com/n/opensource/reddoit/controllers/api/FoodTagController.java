package com.n.opensource.reddoit.controllers.api;

import com.n.opensource.reddoit.controllers.service.FoodTagService;
import com.n.opensource.reddoit.model.dto.FoodTagDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/foodtag")
@AllArgsConstructor
public class FoodTagController {

    @Autowired
    private final FoodTagService foodTagService;
    @PostMapping("/create")
    public ResponseEntity<FoodTagDTO> createFoodTag(@RequestBody FoodTagDTO foodTagDTO) {
        FoodTagDTO createdFoodTag = foodTagService.createFoodTag(foodTagDTO);
        return new ResponseEntity<>(createdFoodTag, HttpStatus.CREATED);
    }

}
