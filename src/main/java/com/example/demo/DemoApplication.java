package com.example.demo;

import com.example.demo.model.CompositeObject;
import com.example.demo.model.OtherObject;
import com.example.demo.model.ValueObject;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);
        ObjectMapper objectMapper = new ObjectMapper();
//        https://www.javadoc.io/static/com.fasterxml.jackson.core/jackson-databind/2.9.8/com/fasterxml/jackson/databind/MapperFeature.html#INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES
//        objectMapper.configure(MapperFeature.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES, false);

//        String valueStr = "{\"name\": \"Test\"}";
//        String valueStr = "Test";
//        ValueObject valueObject = objectMapper.readValue(valueStr, ValueObject.class);
//        System.out.println("Value object is " + objectMapper.writeValueAsString(valueObject));

//        String otherStr = "{\"key\": \"abc\", \"value\": \"xyz\"}";
//        OtherObject otherObject = objectMapper.readValue(otherStr, OtherObject.class);
//        System.out.println("Value other object is " + objectMapper.writeValueAsString(otherObject));

//        String compositeStr = "{\"id\": \"abc\", \"name\": {\"name\": \"test\"}}";
        String compositeStr = "{\"id\": \"abc\", \"name\": \"test\"}";

        CompositeObject compositeObject = objectMapper.readValue(compositeStr, CompositeObject.class);
        System.out.println("Composite object is " + compositeObject.toString());
	}

}
