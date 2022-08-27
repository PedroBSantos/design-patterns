package com.head.first.calculadora;

public class SubtractCalculatorCommand implements CalculatorCommand {

    private int operand;
    private Calculator calculator;

    public SubtractCalculatorCommand(int operand, Calculator calculator) {
        this.operand = operand;
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        this.calculator.subtract(this.operand);
    }

    @Override
    public void undo() {
        this.calculator.sum(this.operand);
    }
}
