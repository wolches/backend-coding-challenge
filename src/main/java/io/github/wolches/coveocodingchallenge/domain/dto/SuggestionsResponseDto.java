package io.github.wolches.coveocodingchallenge.domain.dto;

import lombok.Value;

import java.util.List;

@Value
public class SuggestionsResponseDto {

    List<SuggestionDto> suggestions;
}
