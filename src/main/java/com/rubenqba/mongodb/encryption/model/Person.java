package com.rubenqba.mongodb.encryption.model;

import com.bol.secure.Encrypted;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Person summary here...
 *
 * @author rbresler
 **/
@Document(collection = "people")
@Data
public class Person {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    @Encrypted
    private String email;
    @Encrypted
    private Address address;
}
