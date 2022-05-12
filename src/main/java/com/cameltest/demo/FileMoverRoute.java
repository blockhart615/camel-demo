package com.cameltest.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileMoverRoute extends RouteBuilder {
    
    @Override
	public void configure() throws Exception {
        from("file:{{route.from}}?noop=true")
        .log("Moving file ${header.CamelFileName}")
        .to("file:{{route.to}}", "file:{{route.archive}}");
	}
}
