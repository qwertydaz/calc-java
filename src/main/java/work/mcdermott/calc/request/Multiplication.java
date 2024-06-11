package work.mcdermott.calc.request;

public record Multiplication(
        double multiplicand,
        double multiplier

) {
    public double product() {
        return multiplicand * multiplier;
    }
}
