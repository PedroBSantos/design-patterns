package com.head.first;

import com.head.first.calculadora.Calculator;
import com.head.first.calculadora.SumCalculatorCommand;

public class App {

    public static void main(String[] args) {
        var calculator = new Calculator();
        calculator.setCurrent(1);
        var sumCalculatorCommand = new SumCalculatorCommand(1, calculator);
        sumCalculatorCommand.execute();
        sumCalculatorCommand.undo();
    }
}
