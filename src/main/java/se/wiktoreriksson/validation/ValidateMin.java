package se.wiktoreriksson.validation;

import se.wiktoreriksson.validation.constraints.Min;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidateMin implements ConstraintValidator<Min,Number> {
    double min;
    @Override
    public void initialize(Min constraintAnnotation) {
        min=constraintAnnotation.min();
    }

    @Override
    public boolean isValid(Number number, ConstraintValidatorContext constraintValidatorContext) {
        return number.doubleValue()>=min;
    }
    public ValidateMin(){}
}