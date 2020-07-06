package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Value;

@Value
public class CompositeObject {
    private String id;

//    @JsonUnwrapped
    private ValueObject name;
}
