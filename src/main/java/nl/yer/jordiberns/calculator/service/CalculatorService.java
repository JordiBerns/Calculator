package nl.yer.jordiberns.calculator.service;

import nl.yer.jordiberns.calculator.model.Calculator;
import nl.yer.jordiberns.calculator.repository.CalculatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CalculatorService {

    @Autowired
    private CalculatorRepository calculatorRepository;

    public Calculator save(Calculator calculator) {
        return this.calculatorRepository.save(calculator);
    }

    public Optional<Calculator> findById(long id){
        return this.calculatorRepository.findById(id);
    }

}
