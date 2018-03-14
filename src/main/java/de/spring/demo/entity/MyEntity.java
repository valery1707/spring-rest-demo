package de.spring.demo.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.vavr.collection.Seq;
import org.springframework.data.annotation.Id;

public class MyEntity {

    @Id
    private String id;
    private final String foo;
    private final Seq<String> myList;

    @JsonCreator
    public MyEntity(@JsonProperty("foo") final String foo,
                    @JsonProperty("myList") final Seq<String> myList) {
        this.foo = foo;
        this.myList = myList;
    }

    public String getId() {
        return id;
    }

    public String getFoo() {
        return foo;
    }

    public Seq<String> getMyList() {
        return myList;
    }
}
