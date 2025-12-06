package com.springboot.project.lovable_clone.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {

    Long id;
    String nme;
    String stringPriceId;
    Integer maxProjects;
    Integer maxPreview;
    Boolean unlimitedAi;
    Boolean active;
}
