package com.n.opensource.reddoit.model.repository;

import com.n.opensource.reddoit.model.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}