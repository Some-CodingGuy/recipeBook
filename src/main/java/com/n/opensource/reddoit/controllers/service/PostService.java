package com.n.opensource.reddoit.controllers.service;

import com.n.opensource.reddoit.model.dto.RecipeDTO;
import com.n.opensource.reddoit.model.repository.PostRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Getter
@AllArgsConstructor
public class PostService {

    final static Logger LOG = LoggerFactory.getLogger(PostService.class);

    private final PostRepository postRepository;

    public RecipeDTO createPost(RecipeDTO recipeDTO){
        return getPostRepository().save(recipeDTO);
    }

    public RecipeDTO getPostById(UUID postID){
        return getPostRepository().findById(postID).orElse(null);
    }

    public void deletePost (UUID postID){
        Optional<RecipeDTO> post = getPostRepository().findById(postID);
        if (post.isPresent()){
            getPostRepository().delete(post.get());
            LOG.info("Post with ID {} got deleted", post.get().getId());
        } else {
            LOG.error(String.format("Post with id %i doesn't exist!", postID));
        }
    }

}
