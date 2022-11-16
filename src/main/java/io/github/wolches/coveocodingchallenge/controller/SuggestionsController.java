package io.github.wolches.coveocodingchallenge.controller;

import io.github.wolches.coveocodingchallenge.domain.dto.SuggestionsResponseDto;
import io.github.wolches.coveocodingchallenge.service.SuggestionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class SuggestionsController {

    private final SuggestionsService suggestionsService;

    @GetMapping("/suggestions")
    public ResponseEntity<SuggestionsResponseDto> processSuggestionsRequest(
        @RequestParam(name="q") String query,
        @RequestParam(name="latitude", required = false) Double latitude,
        @RequestParam(name="longtitude", required = false) Double longtitude
    ) {
        SuggestionsResponseDto responseDto = suggestionsService.getSuggestions(query, latitude, longtitude);
        return ResponseEntity.ok(responseDto);
    }
}
