import se.wiktoreriksson.validation.constraints.Email;

public class ValidateTestEmail {
    @Email String email;

    public String getEmail() {
        return email;
    }

    public ValidateTestEmail setEmail(String email) {
        this.email = email;
        return this;
    }
}
