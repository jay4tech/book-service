package com.library.book.utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.library.book.entity.Book;

import java.util.List;


public class UtilityMapper {

    public static Book stringToBook(String json) {
        Book book = null;
        try {
            return getMapper().readValue(json, Book.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> List responseToModel(String json, Class<T> clazz) {

        try {
            return getMapper().readerForListOf(clazz).readValue(json);
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    public static String getJsonString(Book json) {
        try {
            return getMapper().writeValueAsString(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static ObjectMapper getMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.registerModule(new JavaTimeModule());
        return mapper;
    }

}
