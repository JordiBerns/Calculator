package nl.yer.jordiberns.calculator.repository;

import nl.yer.jordiberns.calculator.model.Calculator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculatorRepository extends CrudRepository<Calculator, Long> {
}
