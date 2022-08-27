package com.head.first.calculadora;

public class SumCalculatorCommand implements CalculatorCommand {

    private int operand;
    private Calculator calculator;

    public SumCalculatorCommand(int operand, Calculator calculator) {
        this.operand = operand;
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        this.calculator.sum(this.operand);
    }

    @Override
    public void undo() {
        this.calculator.subtract(this.operand);
    }
}
