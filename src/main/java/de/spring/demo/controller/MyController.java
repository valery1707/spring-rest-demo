package de.spring.demo.controller;

import de.spring.demo.entity.MyEntity;
import de.spring.demo.repo.MyRepository;
import io.swagger.annotations.ApiParam;
import io.vavr.collection.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/api/entities")
public class MyController {
    private final MyRepository repo;

    public MyController(MyRepository repo) {
        this.repo = repo;
    }

    @RequestMapping(value = "/create", method = GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public MyEntity createAndGetEntity(@ApiParam(name = "foo", defaultValue = "foo", required = true) @RequestParam("foo") final String foo) {
        return this.repo.save(new MyEntity(foo + System.currentTimeMillis(), List.of("bla")));
    }
}
