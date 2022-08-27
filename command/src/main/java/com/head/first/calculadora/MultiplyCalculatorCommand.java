package com.head.first.calculadora;

public class MultiplyCalculatorCommand implements CalculatorCommand {

    private int operand;
    private Calculator calculator;

    public MultiplyCalculatorCommand(int operand, Calculator calculator) {
        this.operand = operand;
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        this.calculator.multiply(this.operand);
    }

    @Override
    public void undo() {
        this.calculator.divide(this.operand);
    }
}
