package com.devsuperior.demo.services.validation;

import com.devsuperior.demo.controllers.exceptions.FieldMessage;
import com.devsuperior.demo.dto.EventDTO;
import com.devsuperior.demo.entities.Event;
import com.devsuperior.demo.repositories.EventRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PastDateValidator implements ConstraintValidator<PastDate, LocalDate> {


    @Override
    public void initialize(PastDate constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // Ou false, se a data é obrigatória
        }
        return value.isAfter(LocalDate.now());

    }
}
