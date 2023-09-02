package com.n.opensource.reddoit.model.repository;

import com.n.opensource.reddoit.model.entity.FoodTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodTagRepository extends JpaRepository<FoodTag, Long> {
}
