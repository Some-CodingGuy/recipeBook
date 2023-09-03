package com.n.opensource.reddoit.controllers.api;

import com.n.opensource.reddoit.controllers.service.RatingService;
import com.n.opensource.reddoit.model.dto.RatingDTO;
import com.n.opensource.reddoit.requests.CreateRatingRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/rating")
@AllArgsConstructor
public class RatingController {

    private final RatingService ratingService;

    // Create
    @PostMapping("/rate")
    public ResponseEntity<RatingDTO> createRating(@RequestBody CreateRatingRequest createRatingRequest){
        return ResponseEntity.ok(ratingService.createRating(createRatingRequest));
    }

    // Read
    @GetMapping("/getRating")
    public ResponseEntity<RatingDTO> getRating(@RequestParam(name = "id") UUID ratingId){
        return ResponseEntity.ok(ratingService.getRatingById(ratingId));
    }

    // Delete
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteRating(@RequestParam(name = "id") UUID id){
        ratingService.deleteRating(id);
        String response = "Rating has been deleted";
        return ResponseEntity.ok(response);
    }
}
