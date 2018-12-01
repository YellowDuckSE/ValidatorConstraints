import se.wiktoreriksson.validation.constraints.Regex;

public class ValidateTestRegex {
    @Regex(regexp = "\\d*")
    String regex;

    public String getRegex() {
        return regex;
    }

    public ValidateTestRegex setRegex(String regex) {
        this.regex = regex;
        return this;
    }
}
