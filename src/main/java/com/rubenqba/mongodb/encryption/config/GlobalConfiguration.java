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
@ImportAutoConfiguration({EncryptAutoConfiguration.class})  // No cuenta con el soporte de Spring 3.2.x para la autoconfiguración
                                                            // por eso hay que incluirlo manualmente
public class GlobalConfiguration {
}
