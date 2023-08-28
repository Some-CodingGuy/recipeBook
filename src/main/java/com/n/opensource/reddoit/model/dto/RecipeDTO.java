package com.n.opensource.reddoit.model.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecipeDTO {

    @Id
    private UUID id;
    private String title;
    @OneToOne
    private ImportantInfoRecipeDTO importantInfo;
    private String bodyContent;
    @ManyToOne
    private UserDTO author;
    private boolean isOnline;
    private Date creationTime;
    private Date publishedTime;

    // Add a banner for the post

}
