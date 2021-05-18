package com.example.postaldetail.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

    public static <T> T fromJson(String json, Class<T> entity) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, entity);
    }

    public static <T> T[] fromJsonArray(String json, Class<T[]> entity) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, entity);
    }
}
