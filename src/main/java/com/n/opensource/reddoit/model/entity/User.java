package com.n.opensource.reddoit.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

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
    //private ArrayList<Recipe> recipes;
}
