package com.rubenqba.mongodb.encryption.ctrl;

import com.rubenqba.mongodb.encryption.model.Person;
import com.rubenqba.mongodb.encryption.service.PeopleService;
import org.springframework.web.bind.annotation.*;

/**
 * PeopleCtrl summary here...
 *
 * @author rbresler
 **/
@RestController
@RequestMapping("/people")
public class PeopleCtrl {

    private final PeopleService people;

    public PeopleCtrl(PeopleService people) {
        this.people = people;
    }

    @PostMapping("/repository")
    public Person saveWithRepository(@RequestBody Person person) {
        return people.saveWithRepository(person);
    }

    @PostMapping("/mongo-template")
    public Person saveWithMongoTemplate(@RequestBody Person person) {
        return people.saveWithMongoTemplate(person);
    }

    @GetMapping("/repository/{id}")
    public Person findPersonWithRepository(@PathVariable String id) {
        return people.findPersonWithRepository(id);
    }

    @GetMapping("/mongo-template/{id}")
    public Person findPersonWithMongoTemplate(@PathVariable String id) {
        return people.findPersonWithMongoTemplate(id);
    }
}
