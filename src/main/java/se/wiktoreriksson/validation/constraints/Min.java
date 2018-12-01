package se.wiktoreriksson.validation.constraints;

import se.wiktoreriksson.validation.ValidateMin;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD,PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {ValidateMin.class})
public @interface Min {
    String message() default "Please match size";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    double min();
}
