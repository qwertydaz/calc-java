package work.mcdermott.calc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import work.mcdermott.calc.request.Addition;
import work.mcdermott.calc.request.Division;
import work.mcdermott.calc.request.Multiplication;
import work.mcdermott.calc.request.Subtraction;
import work.mcdermott.calc.response.IResponse;
import work.mcdermott.calc.service.OperationService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operation")
public class OperationController {

    private final OperationService operationService;

    public OperationController(OperationService operationService) {
        this.operationService = operationService;
    }

    @PostMapping("/add")
    public IResponse add(@RequestBody Addition req) {
        return operationService.add(req);
    }

    @PostMapping("/subtract")
    public IResponse subtract(@RequestBody Subtraction req) {
        return operationService.subtract(req);
    }

    @PostMapping("/multiply")
    public IResponse multiply(@RequestBody Multiplication req) {
        return operationService.multiply(req);
    }

    @PostMapping("/divide")
    public IResponse divide(@RequestBody Division req) {
        return operationService.divide(req);
    }
}
