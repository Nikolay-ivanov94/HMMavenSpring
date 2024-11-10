package pro.sky.skypro_Maven_Spring;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String add(int num1, int num2) {
        int result = num1 + num2;
        return String.format("%d + %d = %d", num1, num2, result);
    }

    public String subtract(int num1, int num2) {
        int result = num1 - num2;
        return String.format("%d - %d = %d", num1, num2, result);
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return String.format("%d * %d = %d", num1, num2, result);
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "Деление на ноль невозможно";
        }
        int result = num1 / num2;
        return String.format("%d / %d = %d", num1, num2, result);
    }
}