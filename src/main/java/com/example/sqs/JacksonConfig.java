package com.example.sqs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class JacksonConfig {

	@Bean
	public MappingJackson2MessageConverter mappingJackson2MessageConverter(ObjectMapper objectMapper) {
		MappingJackson2MessageConverter jackson2MessageConverter = new MappingJackson2MessageConverter();
		jackson2MessageConverter.setObjectMapper(objectMapper);
		return jackson2MessageConverter;
	}

}
