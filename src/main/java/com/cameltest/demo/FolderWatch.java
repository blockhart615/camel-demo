package com.cameltest.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FolderWatch extends RouteBuilder {
    
    @Override
	public void configure() throws Exception {
        from("file-watch:{{route.from}}?events=MODIFY,CREATE&antInclude=**/*.moveme")
        .log("Moving file ${header.CamelFileName}")
        .to("file:{{route.to}}", "file:{{route.archive}}");
	}
}
