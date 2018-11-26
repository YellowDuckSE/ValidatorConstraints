package se.wiktoreriksson.validation.constraints;

import se.wiktoreriksson.validation.ValidatorRegex;

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
@Constraint(validatedBy = {ValidatorRegex.class})
public @interface Regex {
    String message() default "Please match regexp '{regexp}'";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    String regexp();
}
