package com.ctg.mvpservice.provider.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
/**
 * OpenAPI (read: swagger) page configuration
 * @author ginno
 *
 */
@Component
public class OpenApiConfiguration {

	  @Bean
	  public OpenAPI springShopOpenAPI() {
	      return new OpenAPI()
	              .info(new Info().title("CTG MVP Service")
	              .description("At the moment..  just some POC CRUD app..  but more to come hopefully! (Also.. TODO: Update me)")
	              .version("v0.0.1"));
	  }
}
