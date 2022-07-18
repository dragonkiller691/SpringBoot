package com.boot.todo.errors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.StreamUtils;
import org.springframework.web.client.DefaultResponseErrorHandler;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by Dmytro Honchar
 * Date: 7/18/2022
 */

public class ToDoErrorHandler extends DefaultResponseErrorHandler {
    private final Logger log = LoggerFactory.getLogger(ToDoErrorHandler.class);

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        log.error(response.getStatusCode().toString());
        log.error(StreamUtils.copyToString(response.getBody(), Charset.defaultCharset()));
    }
}
