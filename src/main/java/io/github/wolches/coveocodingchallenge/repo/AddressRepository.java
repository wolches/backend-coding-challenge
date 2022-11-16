package io.github.wolches.coveocodingchallenge.repo;

import io.github.wolches.coveocodingchallenge.domain.persistence.Address;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {


}
