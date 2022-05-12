package com.cameltest.demo;

import org.apache.camel.CamelContext;
import org.apache.camel.Configuration;
// import org.apache.camel.language.bean.Bean;
import org.springframework.beans.factory.annotation.Autowired;

@Configuration
public class MyAppConfig {
    
    @Autowired
    CamelContext camelContext;

    // @Bean
    // MyService myService() {
    //     return new DefaultMyService(camelContext);
    // }
}
