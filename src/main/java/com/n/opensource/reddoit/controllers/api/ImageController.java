package com.n.opensource.reddoit.controllers.api;

import com.n.opensource.reddoit.controllers.service.ImageService;
import com.n.opensource.reddoit.model.entity.Image;
import com.n.opensource.reddoit.requests.CreateImageRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/image")
@AllArgsConstructor
public class ImageController {

    @Autowired
    private final ImageService imageService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file, @RequestParam("title") String title) {
        try {
            CreateImageRequest createImageRequest = CreateImageRequest.builder()
                    .imageData(file.getBytes())
                    .title(title)
                    .build();
            imageService.uploadImage(createImageRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body("error while uploading image");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error while uploading image");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<byte[]> getImageById(@PathVariable Long id) {
        Image image = imageService.getImageById(id);
        if (image == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(image.getImageData());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteImage(@PathVariable Long id) {
        boolean deleted = imageService.deleteImage(id);
        if (deleted) return ResponseEntity.ok("Image got deleted");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Image not found");
    }
}