package com.ctg.mvpservice;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * This is the primary 'configuration' class. It's purpose is really just to sit here and let me flip
 * config switches via javaConfig annotations.
 * @author ginno
 *
 */
@Configuration
@ComponentScan(basePackages = "com.ctg.mvpservice.*", excludeFilters = @Filter(Configuration.class))   
@EnableJpaRepositories("com.ctg.mvpservice.repository")   
@EntityScan("com.ctg.mvpservice.domain.persistence")   
public class MvpServiceConfiguration {

}
