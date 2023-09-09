package com.n.opensource.reddoit.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Rating {

    @Id
    private UUID id;
    private Integer rating;
    @ManyToOne
    private User ratingFrom;
    @ManyToOne
    private Recipe recipeRated;
    // Potentially we could add a description to this, like a review on why the rating
}
