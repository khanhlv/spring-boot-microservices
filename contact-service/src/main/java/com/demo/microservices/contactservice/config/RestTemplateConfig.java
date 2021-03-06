package com.demo.microservices.contactservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author kaihe
 *
 */

@Configuration
public class RestTemplateConfig {

  @Bean
  @LoadBalanced // Load balance between service instances running at different ports.
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
