package com.cameltest.demo;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileMoverRoute extends RouteBuilder {
    
    @Override
	public void configure() throws Exception {
        from("file:" + Config.INBOX + "?noop=true") // noop makes it so the file will be COPIED, not MOVED
        .log("Moving file ${header." + Exchange.FILE_NAME + "}")
        .to("file:" + Config.OUTBOX, "file:" + Config.ARCHIVE);
	}
}
