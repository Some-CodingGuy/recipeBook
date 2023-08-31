package com.n.opensource.reddoit.model.repository;

import com.n.opensource.reddoit.model.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
