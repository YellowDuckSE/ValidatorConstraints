package se.wiktoreriksson.validation.constraints;

import se.wiktoreriksson.validation.ValidatorSMM;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD,PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {ValidatorSMM.ValidateSize.class})
public @interface Size {
    String message() default "Please match size";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    double min();

    double max();
}
