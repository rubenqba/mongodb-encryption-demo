package com.rubenqba.mongodb.encryption.service;

import com.rubenqba.mongodb.encryption.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * PeopleRepository summary here...
 *
 * @author rbresler
 **/
public interface PeopleRepository extends MongoRepository<Person, String> {
}
