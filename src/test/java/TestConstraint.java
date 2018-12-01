import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class TestConstraint {
    static Validator v;

    @BeforeClass
    public static void init() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        v = factory.getValidator();
    }
    @Test
    public void testRegex() {
        ValidateTestRegex test = new ValidateTestRegex().setRegex("12321");
        Set<ConstraintViolation<ValidateTestRegex>> violations = v.validate(test);
        assertEquals(0,violations.size());
        violations = v.validate(test.setRegex("12cb3bc21"));
        assertEquals(1,violations.size());
    }
    @Test
    public void testEmail() {
        ValidateTestEmail test = new ValidateTestEmail().setEmail("valid@email.com");
        Set<ConstraintViolation<ValidateTestEmail>> violations = v.validate(test);
        assertEquals(0,violations.size());
        violations = v.validate(test.setEmail("invalid@.email.com notice the . directly after @"));
        assertEquals(1,violations.size());
    }
    @Test
    public void testSize() {
        ValidateTestSize test = new ValidateTestSize().setSize(4);
        Set<ConstraintViolation<ValidateTestSize>> violations = v.validate(test);
        assertEquals(0,violations.size());
        violations = v.validate(test.setSize(2));
        assertEquals(1,violations.size());
    }
    @Test
    public void testMin() {
        ValidateTestMin test = new ValidateTestMin().setMin(5);
        Set<ConstraintViolation<ValidateTestMin>> violations = v.validate(test);
        assertEquals(0,violations.size());
        violations = v.validate(test.setMin(1));
        assertEquals(1,violations.size());
    }
    @Test
    public void testMax() {
        ValidateTestMax test = new ValidateTestMax().setMax(3);
        Set<ConstraintViolation<ValidateTestMax>> violations = v.validate(test);
        assertEquals(0,violations.size());
        violations = v.validate(test.setMax(10));
        assertEquals(1,violations.size());
    }
}
