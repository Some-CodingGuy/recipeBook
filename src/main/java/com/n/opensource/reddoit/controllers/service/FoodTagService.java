package com.n.opensource.reddoit.controllers.service;

import com.n.opensource.reddoit.model.dto.FoodTagDTO;
import com.n.opensource.reddoit.model.entity.FoodTag;
import com.n.opensource.reddoit.model.repository.FoodTagRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FoodTagService {

    @Autowired
    private final FoodTagRepository foodTagRepository;
    private ModelMapper modelMapper;
    public FoodTagDTO createFoodTag(FoodTagDTO foodTagDTO) {
        FoodTag foodTag = modelMapper.map(foodTagDTO, FoodTag.class);
        FoodTag savedFoodTag = foodTagRepository.save(foodTag);
        return modelMapper.map(savedFoodTag, FoodTagDTO.class);
    }
}
