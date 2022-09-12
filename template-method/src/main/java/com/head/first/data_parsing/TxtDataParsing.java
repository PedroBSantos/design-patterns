package com.head.first.data_parsing;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

public class TxtDataParsing extends DataParsing {

    private final String txtPath;
    private String dataLoaded;

    public TxtDataParsing(String txtPath) {
        this.txtPath = txtPath;
    }

    @Override
    public void connectDataSource() {
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(this.txtPath))) {
            this.dataLoaded = new String(inputStream.readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Customer> extract() {
        return this.dataLoaded.lines().map(line -> {
            var lineSplited = line.split("\t");
            return new Customer(lineSplited[0], lineSplited[1], lineSplited[2]);
        }).collect(Collectors.toList());
    }
}
