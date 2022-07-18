package com.boot.todo.repository;

import com.boot.todo.domain.ToDo;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Dmytro Honchar
 * Date: 7/14/2022
 */

@Repository
public class ToDoRepository implements CommonRepository<ToDo> {
    private final Map<String, ToDo> toDos = new HashMap<>();

    @Override
    public ToDo save(ToDo domain) {
        ToDo result = toDos.get(domain.getId());
        if (result != null) {
            result.setModified(LocalDateTime.now());
            result.setDescription(domain.getDescription());
            result.setCompleted(domain.isCompleted());
            domain = result;
        }
        toDos.put(domain.getId(), domain);
        return toDos.get(domain.getId());
    }

    @Override
    public Iterable<ToDo> save(Collection<ToDo> domains) {
        domains.forEach(this::save);
        return findAll();
    }

    @Override
    public void delete(ToDo domain) {
        toDos.remove(domain.getId());
    }

    @Override
    public ToDo findById(String id) {
        return toDos.get(id);
    }

    @Override
    public Iterable<ToDo> findAll() {
        return toDos.entrySet().stream().sorted(entryComparator).map
                (Map.Entry::getValue).collect(Collectors.toList());
    }

    private final Comparator<Map.Entry<String, ToDo>> entryComparator =
            Comparator.comparing((Map.Entry<String, ToDo> o) -> o.getValue().getCreated());
}