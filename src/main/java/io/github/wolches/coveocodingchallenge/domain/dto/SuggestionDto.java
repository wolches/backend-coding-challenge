package io.github.wolches.coveocodingchallenge.domain.dto;

import lombok.Value;

@Value
public class SuggestionDto {

    String name;
    Double latitude;
    Double longtitude;
    Double score;
}
