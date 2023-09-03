package com.n.opensource.reddoit.model.dto;

import com.n.opensource.reddoit.model.enums.Measurements;
import lombok.Getter;

@Getter
public class IngredientDTO {
    public String name;
    public long amount;
    public Measurements measurements;
}
