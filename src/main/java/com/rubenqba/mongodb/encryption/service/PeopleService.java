package com.rubenqba.mongodb.encryption.service;

import com.rubenqba.mongodb.encryption.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * PeopleService summary here...
 *
 * @author rbresler
 **/
@Service
public class PeopleService {
    private static final Logger log = LoggerFactory.getLogger(PeopleService.class);

    private final MongoTemplate template;
    private final PeopleRepository repository;

    public PeopleService(MongoTemplate template, PeopleRepository repository) {
        this.template = template;
        this.repository = repository;
    }

    public Person saveWithRepository(Person person) {
        log.info("Saving using repository: {}", person);
        return repository.save(person);
    }

    public Person saveWithMongoTemplate(Person person) {
        log.info("Saving using mongo template: {}", person);
        return template.save(person);
    }

    public Person findPersonWithRepository(String id) {
        log.info("Finding using repository: {}", id);
        return repository.findById(id).orElse(null);
    }

    public Person findPersonWithMongoTemplate(String id) {
        log.info("Finding using mongo template: {}", id);
        return template.findById(id, Person.class);
    }
}
