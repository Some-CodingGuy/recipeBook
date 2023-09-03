package com.n.opensource.reddoit.model.repository;

import com.n.opensource.reddoit.model.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RatingRepository extends JpaRepository<Rating, UUID> {
}
