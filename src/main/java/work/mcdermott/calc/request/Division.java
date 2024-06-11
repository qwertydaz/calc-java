package work.mcdermott.calc.request;

import work.mcdermott.calc.err.OperationException;

import static work.mcdermott.calc.consts.ErrorConsts.DIVIDE_BY_ZERO;

public record Division(
        double dividend,
        double divisor

) {
    public Division {
        if (divisor == 0.0) throw new OperationException(DIVIDE_BY_ZERO);
    }

    public double quotient() {
        return dividend / divisor;
    }
}
