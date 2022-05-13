package com.cameltest.demo;

import org.apache.camel.CamelContext;
import org.apache.camel.Configuration;
// import org.apache.camel.language.bean.Bean;
import org.springframework.beans.factory.annotation.Autowired;

@Configuration
public class Config {
    
    // Spring automagically creates the camelContext
    @Autowired
    CamelContext camelContext;

    public static final String RECURSIVE = "{{folderWatch.recursive}}";
    public static final String INBOX = "{{route.from}}";
    public static final String OUTBOX = "{{route.to}}";
    public static final String ARCHIVE = "{{route.archive}}";
    public static final String POLLING_FREQUENCY = "{{pollingFrequency}}";
}
