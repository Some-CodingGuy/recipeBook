package com.n.opensource.reddoit.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;
    private String email;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Rating> userRatings;
    //private ArrayList<Recipe> recipes;
}
