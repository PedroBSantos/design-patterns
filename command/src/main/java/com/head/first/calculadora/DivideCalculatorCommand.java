package com.head.first.calculadora;

public class DivideCalculatorCommand implements CalculatorCommand {

    private int operand;
    private Calculator calculator;

    public DivideCalculatorCommand(int operand, Calculator calculator) {
        this.operand = operand;
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        this.calculator.divide(this.operand);
    }

    @Override
    public void undo() {
        this.calculator.multiply(this.operand);
    }
}
