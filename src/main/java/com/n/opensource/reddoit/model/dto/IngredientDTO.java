package com.n.opensource.reddoit.model.dto;

import lombok.Getter;

@Getter
public class IngredientDTO {
    public String name;
    public long amount;
    public Measurements measurements;
}
