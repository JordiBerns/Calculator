package nl.yer.jordiberns.calculator.controller;

import nl.yer.jordiberns.calculator.model.Calculator;
import nl.yer.jordiberns.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping("api/calculator")
@CrossOrigin("*")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping
    public Calculator add(@RequestBody Calculator calculator) {
        return this.calculatorService.save(calculator);
    }

    @GetMapping("add/" + "{id}")
    public int add(@PathVariable long id) {
        Optional<Calculator> optionalCalculator = this.calculatorService.findById(id);
        if(optionalCalculator.isPresent()){
            Calculator result = optionalCalculator.get();
            return (result.getFirstNumber()) + (result.getSecondNumber());
        }
        else {
            return 0;
        }
    }

}
