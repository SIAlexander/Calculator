package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceInterface calculatorService;

    public CalculatorController(CalculatorServiceInterface calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello(){
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String addition(@RequestParam("num1") int oneNumber, @RequestParam("num2") int twoNumber ){
        return calculatorService.addition(oneNumber, twoNumber);
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam("num1") int oneNumber, @RequestParam ("num2") int twoNumber){
        return calculatorService.subtraction(oneNumber, twoNumber);
    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam("num1") int oneNumber, @RequestParam ("num2") int twoNumber){
        return calculatorService.multiplication(oneNumber, twoNumber);
    }
    @GetMapping(path = "/divide")
    public String division(@RequestParam("num1") int oneNumber, @RequestParam ("num2") int twoNumber){
        return calculatorService.division(oneNumber, twoNumber);
    }

}
