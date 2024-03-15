package com.rubenqba.mongodb.encryption.model;

import lombok.Data;

/**
 * Address summary here...
 *
 * @author rbresler
 **/
@Data
public class Address {
    private String street;
    private String city;
    private String state;
    private int zip;
}
