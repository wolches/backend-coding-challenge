package io.github.wolches.coveocodingchallenge.config;

import io.github.wolches.coveocodingchallenge.domain.persistence.Address;
import io.github.wolches.coveocodingchallenge.file.DataFileReader;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.function.Function;

@Setter
@Configuration
@ConfigurationProperties(prefix = "app.data-file")
public class DataFileReaderConfig {

    private String dataFilePath;

    @Bean
    public DataFileReader dataFileReader() throws FileNotFoundException {
        return new DataFileReader(dataFile(), addressParsingFunction(), true);
    }

    private File dataFile() throws FileNotFoundException {
        return ResourceUtils.getFile(dataFilePath);
    }

    private Function<String, Address> addressParsingFunction() {
        return s -> {
            String[] fields = s.split("\t");
            return new Address();
        };
    }
}