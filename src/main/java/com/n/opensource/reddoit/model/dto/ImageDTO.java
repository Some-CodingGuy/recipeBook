package com.n.opensource.reddoit.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ImageDTO {
    public long id;
    public byte[] imageData;
    private String title;
}
