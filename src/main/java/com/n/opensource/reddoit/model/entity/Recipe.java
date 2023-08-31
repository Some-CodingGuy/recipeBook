package com.n.opensource.reddoit.model.entity;

import com.n.opensource.reddoit.model.dto.ImportantInfoRecipeDTO;
import com.n.opensource.reddoit.model.dto.UserDTO;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Recipe {
    @Id
    private UUID id;
    private String title;
    @OneToOne
    private ImportantInfoRecipeDTO importantInfo;
    private String bodyContent;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private List<Ingredient> ingredients;
    @ManyToOne
    private UserDTO author;
    private boolean isOnline;
    private Date creationTime;
    private Date publishedTime;
}
