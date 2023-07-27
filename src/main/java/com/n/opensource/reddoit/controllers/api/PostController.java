package com.n.opensource.reddoit.controllers.api;

import com.n.opensource.reddoit.controllers.service.PostService;
import com.n.opensource.reddoit.model.dto.PostDTO;
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
    public ResponseEntity<PostDTO> createPost(PostDTO postDTO){
        return ResponseEntity.ok(postService.createPost(postDTO));
    }

    @GetMapping("/getPost")
    public ResponseEntity<PostDTO> getPostById(@RequestParam(name = "id")UUID postId){
        return ResponseEntity.ok(postService.getPostById(postId));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Void> deletePost(@RequestParam(name = "id")UUID postId){
        postService.deletePost(postId);
        Void void2 = null;
        return ResponseEntity.ok(void2);
    }


}
