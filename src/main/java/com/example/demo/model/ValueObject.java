package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.*;

import java.beans.ConstructorProperties;

//@AllArgsConstructor(staticName = "of", onConstructor = @__({@JsonCreator}))
@AllArgsConstructor(staticName = "of")
@EqualsAndHashCode
//@Setter
//@Getter
//@ToString
//@Value
public class ValueObject {
//    @Getter
private String name;

//    @ConstructorProperties("name")
//    public ValueObject(String name) {
//        this.name = name;
//    }
//
//    public ValueObject of(String name) {
//        return new ValueObject(name);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    private ValueObject(String name) {
//        this.name = name;
//    }
//
//    public ValueObject of(String name) {
//        return new ValueObject(name);
//    }

    @Override
    public String toString() {
        return this.name;
    }
}
