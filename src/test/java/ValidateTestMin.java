import se.wiktoreriksson.validation.constraints.Min;

public class ValidateTestMin {
    @Min(min = 3) double min;

    public double getMin() {
        return min;
    }

    public ValidateTestMin setMin(double min) {
        this.min = min;
        return this;
    }
}
