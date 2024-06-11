package work.mcdermott.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CalculatorApp {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApp.class, args);
    }
}
