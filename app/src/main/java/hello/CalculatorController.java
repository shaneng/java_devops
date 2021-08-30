package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CalculatorController {
    
    public CalculatorLogics logics = new CalculatorLogics();

    @RequestMapping("/cal/add/{a}/{b}")
    public int add(@PathVariable("a") int a, @PathVariable("b") int b) {
        return logics.add(a, b);
    }
    
}
