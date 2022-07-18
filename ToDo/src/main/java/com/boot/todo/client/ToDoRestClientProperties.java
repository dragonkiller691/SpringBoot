package com.boot.todo.client;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Dmytro Honchar
 * Date: 7/18/2022
 */

@Component
@ConfigurationProperties(prefix="todo")
@Data
public class ToDoRestClientProperties {
    private String url;
    private String basePath;
}