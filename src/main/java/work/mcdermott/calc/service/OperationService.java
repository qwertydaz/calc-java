package work.mcdermott.calc.service;

import work.mcdermott.calc.err.OperationException;
import work.mcdermott.calc.request.Addition;
import work.mcdermott.calc.request.Division;
import work.mcdermott.calc.request.Multiplication;
import work.mcdermott.calc.request.Subtraction;
import work.mcdermott.calc.response.ErrorResponse;
import work.mcdermott.calc.response.IResponse;
import work.mcdermott.calc.response.OperationResponse;

import org.springframework.stereotype.Service;

@Service
public class OperationService {

    public IResponse add(Addition req) {
        return new OperationResponse(req.sum());
    }

    public IResponse subtract(Subtraction req) {
        return new OperationResponse(req.difference());
    }

    public IResponse multiply(Multiplication req) {
        return new OperationResponse(req.product());
    }

    public IResponse divide(Division req) {
        try {
            return new OperationResponse(req.quotient());
        }
        catch (OperationException e) {
            return new ErrorResponse(e.getMessage());
        }
    }
}
