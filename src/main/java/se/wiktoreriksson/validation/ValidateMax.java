package se.wiktoreriksson.validation;

import se.wiktoreriksson.validation.constraints.Max;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidateMax implements ConstraintValidator<Max,Number> {
    double max;
    public ValidateMax(){}
    @Override
    public void initialize(Max constraintAnnotation) {
        max=constraintAnnotation.max();
    }

    @Override
    public boolean isValid(Number number, ConstraintValidatorContext constraintValidatorContext) {
        return number.doubleValue()<=max;
    }
}