package com.rubenqba.mongodb.encryption.config;

import com.bol.config.EncryptAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * GlobalConfiguration summary here...
 *
 * @author rbresler
 **/
@Configuration
@ImportAutoConfiguration({EncryptAutoConfiguration.class})
public class GlobalConfiguration {
}
