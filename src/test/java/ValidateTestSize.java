public class ValidateTestSize {
    @se.wiktoreriksson.validation.constraints.Size(min = 3,max = 5) int size;

    public int getSize() {
        return size;
    }

    public ValidateTestSize setSize(int size) {
        this.size = size;
        return this;
    }
}
