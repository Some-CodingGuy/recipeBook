package com.n.opensource.reddoit.controllers.api;

import com.n.opensource.reddoit.controllers.service.PostService;
import com.n.opensource.reddoit.model.dto.RecipeDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/post")
@AllArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("/create")
    public ResponseEntity<RecipeDTO> createPost(RecipeDTO recipeDTO){
        return ResponseEntity.ok(postService.createPost(recipeDTO));
    }

    @GetMapping("/getPost")
    public ResponseEntity<RecipeDTO> getPostById(@RequestParam(name = "id")UUID postId){
        return ResponseEntity.ok(postService.getPostById(postId));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<String> deletePost(@RequestParam(name = "id")UUID postId){
        postService.deletePost(postId);
        String response = "User has been deleted";
        return ResponseEntity.ok(response);
    }


}
