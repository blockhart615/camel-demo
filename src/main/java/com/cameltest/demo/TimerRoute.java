package com.cameltest.demo;

import java.util.Date;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

// @Component
public class TimerRoute  extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // sends a logging message every {{pollingFrequency}} seconds
        from("timer://foo?fixedRate=true&period=" + Config.POLLING_FREQUENCY)
        .log("Logging the current time: " + new Date().toString());
    }
    
}
