package com.n.opensource.reddoit.requests;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CreateImageRequest {
    public byte[] imageData;
}
