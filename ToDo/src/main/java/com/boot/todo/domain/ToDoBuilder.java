package com.boot.todo.domain;

/**
 * Created by Dmytro Honchar
 * Date: 7/14/2022
 */

public class ToDoBuilder {

    private static final ToDoBuilder instance = new ToDoBuilder();

    private String id = null;

    private String description = "";

    private ToDoBuilder() {

    }

    public static ToDoBuilder create() {
        return instance;
    }

    public ToDoBuilder withDescription(String description){
        this.description = description;
        return instance;
    }

    public ToDoBuilder withId(String id){
        this.id = id;
        return instance;
    }

    public ToDo build(){
        ToDo result = new ToDo(this.description);
        if(id != null)
            result.setId(id);
        return result;
    }

}
