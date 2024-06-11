package work.mcdermott.calc.request;

import work.mcdermott.calc.err.OperationException;

public record Division(
        double dividend,
        double divisor

) {
    public Division {
        if (divisor == 0.0) throw new OperationException("Cannot divide by zero");
    }

    public double quotient() {
        return dividend / divisor;
    }
}
