package io.github.wolches.coveocodingchallenge.domain.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "address")
public class Address {

    private Long id;
    private String name;
    private String ascii;
    private String altName;
    private Double latitude;
    private Double longtitude;
    private String featClass;
    private String featCode;
    private String country;
    private String cc2;
    private String admin1;
    private String admin2;
    private String admin3;
    private String admin4;
    private String population;
    private String elevation;
    private String dem;
    private String tz;
    private LocalDate modifiedAt;

}
