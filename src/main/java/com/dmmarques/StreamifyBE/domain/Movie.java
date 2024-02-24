package com.dmmarques.StreamifyBE.domain;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;

import java.util.List;

@Builder
@Data
public class Movie {
    @Generated
    String id;
    @NotNull
    String title;
    @NotNull
    List<Genre> genreList;
    @NotNull
    double rating;
    @NotNull
    int lengthInMin;
    @NotNull
    int recommendedAge;
}
