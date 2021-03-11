package com.gustavohmcaldas.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.gustavohmcaldas.ecommerce.entity.Product;

@Configuration
public class DataRestConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

		HttpMethod[] theUnsupportedActions = {HttpMethod.POST, HttpMethod.PUT, HttpMethod.DELETE};
		
		// disable HTTP methods for the Product: POST, PUT, DELETE
		config.getExposureConfiguration()
			.forDomainType(Product.class)
			.withItemExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
			.withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
		
		// disable HTTP methods for the Product Category: POST, PUT, DELETE
		config.getExposureConfiguration()
			.forDomainType(Product.class)
			.withItemExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
			.withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
	}
}
