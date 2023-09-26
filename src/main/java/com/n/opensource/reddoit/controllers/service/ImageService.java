package com.n.opensource.reddoit.controllers.service;

import com.n.opensource.reddoit.model.dto.ImageDTO;
import com.n.opensource.reddoit.model.entity.Image;
import com.n.opensource.reddoit.model.repository.ImageRepository;
import com.n.opensource.reddoit.requests.CreateImageRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class ImageService {

    private final ImageRepository imageRepository;

    public ImageDTO uploadImage(CreateImageRequest createImageRequest) {
        Image image = Image.builder()
                .imageData(createImageRequest.getImageData())
                .title(createImageRequest.getTitle())
                .build();
        Image savedImage = imageRepository.save(image);

        return ImageDTO.builder()
                .id(savedImage.getId())
                .imageData(savedImage.getImageData())
                .title(savedImage.getTitle())
                .build();
    }

    public Image getImageById(Long id) {
        return imageRepository.findById(id).orElse(null);
    }

    public boolean deleteImage(Long id) {
        Optional<Image> image = imageRepository.findById(id);
        return image.isPresent();
    }

}
