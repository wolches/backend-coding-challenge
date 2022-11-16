package io.github.wolches.coveocodingchallenge.file;

import lombok.RequiredArgsConstructor;

import java.io.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequiredArgsConstructor
public class DataFileReader<T> {

    private final File file;
    private final Function<String, T> lineReaderFunction;
    private final boolean hasHeaders;

    private Stream<String> getLines() {
        try (FileReader fileReader = new FileReader(file)) {
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                return bufferedReader.lines();
            }
        } catch (Throwable e) {
            throw new RuntimeException();
        }
    }

    public List<T> readFile() {
        return getLines()
                .skip(hasHeaders ? 1L : 0)
                .map(lineReaderFunction)
                .collect(Collectors.toList());
    }
}
