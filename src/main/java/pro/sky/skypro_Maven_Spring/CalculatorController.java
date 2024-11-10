package pro.sky.skypro_Maven_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	private final CalculatorService calculatorService;

	@Autowired
	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@GetMapping("/calculator")
	public String welcome() {
		return "Добро пожаловать в калькулятор";
	}

	@GetMapping("/calculator/plus")
	public String add(@RequestParam int num1, @RequestParam int num2) {
		return calculatorService.add(num1, num2);
	}

	@GetMapping("/calculator/minus")
	public String subtract(@RequestParam int num1, @RequestParam int num2) {
		return calculatorService.subtract(num1, num2);
	}

	@GetMapping("/calculator/multiply")
	public String multiply(@RequestParam int num1, @RequestParam int num2) {
		return calculatorService.multiply(num1, num2);
	}

	@GetMapping("/calculator/divide")
	public String divide(@RequestParam int num1, @RequestParam int num2) {
		return calculatorService.divide(num1, num2);
	}
}