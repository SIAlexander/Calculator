package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorServiceInterface {

    public String hello(){
        return "Добро пожаловать в калькулятор";
    }

    public String addition(int oneNumber, int twoNumber){
        int result = oneNumber + twoNumber;
        return oneNumber + " + " + twoNumber + " = " + result;
    }

    public String subtraction(int oneNumber, int twoNumber){
        int result = oneNumber - twoNumber;
        return oneNumber + " - " + twoNumber + " = " + result;
    }

    public String multiplication(int oneNumber, int twoNumber){
        int result = oneNumber * twoNumber;
        return oneNumber + " * " + twoNumber + " = " + result;
    }

    public String division(int oneNumber, int twoNumber){
        if (twoNumber == 0){
            return "Делить на ноль нельзя!!!";
        }
        int result = oneNumber / twoNumber;
        return oneNumber + " / " + twoNumber + " = " + result;
    }
}
