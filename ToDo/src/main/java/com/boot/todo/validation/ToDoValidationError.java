package com.boot.todo.validation;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmytro Honchar
 * Date: 7/14/2022
 */

public class ToDoValidationError {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private final List<String> errors = new ArrayList<>();

    private final String errorMessage;

    public ToDoValidationError(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void addValidationError(String error) {
        errors.add(error);
    }

    public List<String> getErrors() {
        return errors;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
