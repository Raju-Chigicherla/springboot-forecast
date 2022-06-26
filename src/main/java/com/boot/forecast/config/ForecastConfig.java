package com.boot.forecast.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//@formatter:off

/**
* The Class ForecastConfig.
*/
@Configuration
public class ForecastConfig {
	
	private static final Logger LOG = LoggerFactory.getLogger(ForecastConfig.class);

	/**
	 * Rest template.
	 *
	 * @param builder the {@link RestTemplateBuilder}
	 * @return the {@link RestTemplate}
	 */
	@Bean
	RestTemplate restTemplate(RestTemplateBuilder builder) {
		LOG.info("Inside RestTemplate builder method!!!");
		return builder.build();
	}

}

//@formatter:on