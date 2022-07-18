package com.boot.jdbc.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;

/**
 * Created by Dmytro Honchar
 * Date: 7/18/2022
 */
public class ToDoValidationErrorBuilder {
    public static ToDoValidationError fromBindingErrors(Errors errors) {
        ToDoValidationError error = new ToDoValidationError("Validation failed. "
                + errors.getErrorCount() + " error(s)");
        for (ObjectError objectError : errors.getAllErrors()) {
            error.addValidationError(objectError.getDefaultMessage());
        }
        return error;
    }
}
