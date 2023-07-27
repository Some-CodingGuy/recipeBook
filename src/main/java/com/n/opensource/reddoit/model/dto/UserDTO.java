package com.n.opensource.reddoit.model.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    @Id
    private int id;
    private String username;
    private String email;
    private String password;
    private String description;
    @OneToMany
    private List<PostDTO> postDTOList;

    // profile picture
}
