package se.wiktoreriksson.validation;

import se.wiktoreriksson.validation.constraints.Email;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidatorEmail implements ConstraintValidator<Email,String> {
    private String regexp;

    @Override
    public void initialize(Email a) {
        this.regexp = a.regexp();
    }

    @Override
    public boolean isValid(String str, ConstraintValidatorContext constraintValidatorContext) {
        return str.matches(regexp);
    }
}
