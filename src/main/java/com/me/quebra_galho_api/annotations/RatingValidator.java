package com.me.quebra_galho_api.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RatingValidator implements ConstraintValidator<ValidRating, Byte> {
    
    @Override
    public void initialize(ValidRating constraintAnnotation) {
    }
    
    @Override
    public boolean isValid(Byte value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }
        return value >= 0 && value <= 100;
    }
}