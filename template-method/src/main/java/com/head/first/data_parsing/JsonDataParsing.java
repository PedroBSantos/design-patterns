package com.head.first.data_parsing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

public class JsonDataParsing extends DataParsing {

    private final String jsonPath;
    private JsonArray jsonArray;

    public JsonDataParsing(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    @Override
    public void connectDataSource() {
        File file = new File(this.jsonPath);
        try {
            JsonElement jsonElement = JsonParser.parseReader(new FileReader(file));
            this.jsonArray = jsonElement.getAsJsonArray();
        } catch (JsonParseException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Customer> extract() {
        var customers = new ArrayList<Customer>();
        this.jsonArray.forEach(jsonElement -> {
            var jsonObject = jsonElement.getAsJsonObject();
            var customer = new Customer(
                    jsonObject.get("name").getAsString(),
                    jsonObject.get("age").getAsString(),
                    jsonObject.get("cpf").getAsString());
            customers.add(customer);
        });
        return customers;
    }
}
