package work.mcdermott.calc.request;

public record Addition(
        double addend1,
        double addend2

) {
    public double sum() {
        return addend1 + addend2;
    }
}
