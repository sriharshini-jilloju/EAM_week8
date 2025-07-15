package com.humber.week8;


import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class RibbonConfiguration {

    @Autowired
    IClientConfig config;

    @Bean
    public IPing ribbonPing(IClientConfig config) {
        return new PingUrl();  // Ping each instance with a URL to check if it's alive
    }

    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new AvailabilityFilteringRule();  // Skip servers that are down or overloaded
    }
}

