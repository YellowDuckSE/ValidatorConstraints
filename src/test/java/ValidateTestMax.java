import se.wiktoreriksson.validation.constraints.Max;

public class ValidateTestMax {
    public double getMax() {
        return max;
    }

    public ValidateTestMax setMax(double max) {
        this.max = max;
        return this;
    }

    @Max(max = 3) double max;
}
