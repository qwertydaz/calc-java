package work.mcdermott.calc.response;

public record ErrorResponse(
        String message

) implements IResponse { }
