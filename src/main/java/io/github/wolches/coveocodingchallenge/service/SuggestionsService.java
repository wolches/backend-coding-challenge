package io.github.wolches.coveocodingchallenge.service;

import io.github.wolches.coveocodingchallenge.domain.dto.SuggestionsResponseDto;
import io.github.wolches.coveocodingchallenge.domain.persistence.Address;
import io.github.wolches.coveocodingchallenge.file.DataFileReader;
import io.github.wolches.coveocodingchallenge.repo.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SuggestionsService {

    private final AddressRepository addressRepository;
    private final DataFileReader<Address> addressDataFileReader;

    public SuggestionsResponseDto getSuggestions(String query, Double latitude, Double longtitude) {
        return null;
    }
}
