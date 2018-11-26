package se.wiktoreriksson.validation;

import se.wiktoreriksson.validation.constraints.Regex;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidatorRegex implements ConstraintValidator<Regex,String> {
    private String regexp;

    @Override
    public void initialize(Regex a) {
        this.regexp = a.regexp();
    }

    @Override
    public boolean isValid(String str, ConstraintValidatorContext constraintValidatorContext) {
        return str.matches(regexp);
    }
}
