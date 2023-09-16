package com.n.opensource.reddoit.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Recipe {
    @Id
    private UUID id;
    private String title;
    @OneToOne
    private ImportantRecipeInfo importantInfo;
    private String bodyContent;
    @OneToMany(cascade = CascadeType.ALL)
    public List<Ingredient> ingredients;
    @ManyToOne
    private User author;
    private boolean isOnline;
    private Date creationTime;
    private Date publishedTime;
    @OneToMany(cascade = CascadeType.ALL)
    public List<Rating> ratings;
    @Lob
    private byte[] recipeBanner;
    private List<FoodTag> foodTags;
}
