package com.atereshkov.eureka.feign.client;

import com.atereshkov.eureka.client.GreetingController;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient extends GreetingController {
}