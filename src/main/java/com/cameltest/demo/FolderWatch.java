package com.cameltest.demo;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FolderWatch extends RouteBuilder {
    
    @Override
	public void configure() throws Exception {
        String recursive = "recursive=" + Config.RECURSIVE;
        String regex = "antInclude=**/*.moveme";
        String watchEvents = "events=CREATE,MODIFY";
        

        from("file-watch:" + Config.INBOX + "?" + watchEvents + "&" + recursive + "&" + regex)
        .log("FILE WATCH: ${header." + Exchange.FILE_NAME + "}")
        .to("file:" + Config.OUTBOX, "file:" + Config.ARCHIVE);
	}
}
