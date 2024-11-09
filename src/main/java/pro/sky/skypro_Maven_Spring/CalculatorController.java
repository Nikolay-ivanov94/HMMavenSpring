package pro.sky.skypro_Maven_Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	// 1. Метод по адресу /calculator
	@GetMapping("/calculator")
	public String welcome() {
		return "Добро пожаловать в калькулятор";
	}

	// 2. Метод по адресу /calculator/plus
	@GetMapping("/calculator/plus")
	public String add(@RequestParam int num1, @RequestParam int num2) {
		int result = num1 + num2;
		return String.format("%d + %d = %d", num1, num2, result);
	}

	// 3. Метод по адресу /calculator/minus
	@GetMapping("/calculator/minus")
	public String subtract(@RequestParam int num1, @RequestParam int num2) {
		int result = num1 - num2;
		return String.format("%d - %d = %d", num1, num2, result);
	}

	// 4. Метод по адресу /calculator/multiply
	@GetMapping("/calculator/multiply")
	public String multiply(@RequestParam int num1, @RequestParam int num2) {
		int result = num1 * num2;
		return String.format("%d * %d = %d", num1, num2, result);
	}

	// 5. Метод по адресу /calculator/divide
	@GetMapping("/calculator/divide")
	public String divide(@RequestParam int num1, @RequestParam int num2) {
		if (num2 == 0) {
			return "Деление на ноль невозможно";
		}
		int result = num1 / num2;
		return String.format("%d / %d = %d", num1, num2, result);
	}
}
