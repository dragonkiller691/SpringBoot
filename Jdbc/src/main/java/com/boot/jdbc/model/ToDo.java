package com.boot.jdbc.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by Dmytro Honchar
 * Date: 7/14/2022
 */
@Data
public class ToDo {
    private String id;
    private String description;
    private LocalDateTime created;
    private LocalDateTime modified;
    private boolean completed;

    public ToDo(){
        LocalDateTime date = LocalDateTime.now();
        this.id = UUID.randomUUID().toString();
        this.created = date;
        this.modified = date;
    }

    public ToDo(String description){
        this();
        this.description = description;
    }
}