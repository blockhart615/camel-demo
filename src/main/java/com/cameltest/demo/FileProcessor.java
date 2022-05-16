package com.cameltest.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FileProcessor implements Processor {

    private static final Logger LOGGER=LoggerFactory.getLogger(FileProcessor.class);

    /**
     * Business logic goes here.
     */
    @Override
    public void process(Exchange exchange) throws Exception {
        LOGGER.info("Processing for " + exchange.getIn().getBody() + " goes here!");
    }
    
}
