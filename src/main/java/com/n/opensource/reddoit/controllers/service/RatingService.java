package com.n.opensource.reddoit.controllers.service;

import com.n.opensource.reddoit.model.dto.RatingDTO;
import com.n.opensource.reddoit.model.entity.Rating;
import com.n.opensource.reddoit.model.repository.RatingRepository;
import com.n.opensource.reddoit.requests.CreateRatingRequest;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class RatingService {

    final static Logger LOG = LoggerFactory.getLogger(RatingService.class);

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private final RatingRepository ratingRepository;

    public RatingDTO createRating(CreateRatingRequest createRatingRequest) {
        Rating rating = modelMapper.map(createRatingRequest, Rating.class);
        Rating savedRating = ratingRepository.save(rating);
        return modelMapper.map(savedRating, RatingDTO.class);
    }

    public RatingDTO getRatingById(UUID ratingId){
        Optional<Rating> rating = ratingRepository.findById(ratingId);
        return rating.map(value -> modelMapper.map(value, RatingDTO.class)).orElse(null);
    }

    // TODO for next version: Update so users can update their ratings

    public void deleteRating(UUID ratingId){
        Optional<Rating> rating = ratingRepository.findById(ratingId);
        if (rating.isPresent()){
            ratingRepository.delete(rating.get());
            LOG.info("Rating with ID {} got deleted", rating.get().getId());
        } else {
            LOG.error(String.format("Rating with id %s doesn't exist!", ratingId));
        }
    }
}
