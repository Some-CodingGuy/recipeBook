package com.n.opensource.reddoit.requests;

import com.n.opensource.reddoit.model.entity.FoodTag;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SetRecipeFoodTagsRequest {
    List<FoodTag> foodTags;
}
