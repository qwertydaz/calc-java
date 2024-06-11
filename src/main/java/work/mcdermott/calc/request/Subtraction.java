package work.mcdermott.calc.request;

public record Subtraction(
        double minuend,
        double subtrahend

) {
    public double difference() {
        return minuend - subtrahend;
    }
}
