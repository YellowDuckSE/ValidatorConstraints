package se.wiktoreriksson.validation;

import se.wiktoreriksson.validation.constraints.Size;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidateSize implements ConstraintValidator<Size,Number> {
    double min;
    double max;
    @Override
    public void initialize(Size constraintAnnotation) {
        min=constraintAnnotation.min();
        max=constraintAnnotation.max();
    }

    @Override
    public boolean isValid(Number number, ConstraintValidatorContext constraintValidatorContext) {
        return number.doubleValue()>=min&&number.doubleValue()<=max;
    }
    public ValidateSize(){}
}