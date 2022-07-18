package com.boot.todo;

import com.boot.todo.client.ToDoRestClient;
import com.boot.todo.domain.ToDo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by Dmytro Honchar
 * Date: 7/14/2022
 */

@SpringBootApplication
public class TodoApplication {
    private final Logger log = LoggerFactory.getLogger(TodoApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(TodoApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

    @Bean
    public CommandLineRunner process(ToDoRestClient client){
        return args -> {

            Iterable<ToDo> toDos = client.findAll();
            assert toDos != null;
            toDos.forEach( toDo -> log.info(toDo.toString()));

            ToDo newToDo = client.upsert(new ToDo("Drink plenty of Water daily!"));
            assert newToDo != null;
            log.info(newToDo.toString());

            ToDo toDo = client.findById(newToDo.getId());
            assert toDos != null;
            log.info(toDo.toString());

            ToDo completed = client.setCompleted(newToDo.getId());
            assert completed.isCompleted();
            log.info(completed.toString());

            client.delete(newToDo.getId());
            assert client.findById(newToDo.getId()) == null;
        };
    }
}
