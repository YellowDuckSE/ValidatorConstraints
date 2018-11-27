package se.wiktoreriksson.validation;

import se.wiktoreriksson.validation.constraints.Max;
import se.wiktoreriksson.validation.constraints.Min;
import se.wiktoreriksson.validation.constraints.Size;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidatorSMM {
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
            return number.doubleValue()>min&&number.doubleValue()<max;
        }
    }
    public class ValidateMax implements ConstraintValidator<Max,Number> {
        double max;
        @Override
        public void initialize(Max constraintAnnotation) {
            max=constraintAnnotation.max();
        }

        @Override
        public boolean isValid(Number number, ConstraintValidatorContext constraintValidatorContext) {
            return number.doubleValue()<max;
        }
    }
    public class ValidateMin implements ConstraintValidator<Min,Number> {
        double min;
        @Override
        public void initialize(Min constraintAnnotation) {
            min=constraintAnnotation.min();
        }

        @Override
        public boolean isValid(Number number, ConstraintValidatorContext constraintValidatorContext) {
            return number.doubleValue()>min;
        }
    }
}
