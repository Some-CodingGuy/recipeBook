package com.n.opensource.reddoit.model.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImportantInfoDTO {

    @Id
    private UUID id;
//    private List<String> ingredientsList;
//    ingredient substitutions
    private int minNeeded;
    private float difficulty;
    @OneToOne
    private PostDTO post;
}
