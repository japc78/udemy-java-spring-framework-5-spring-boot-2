package com.japcdev.springboot.app.springbootweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySources({
  @PropertySource("classpath:messages.properties")
})
public class MessagesPropertiesConfig {

}
