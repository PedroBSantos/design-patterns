package com.head.first.calculadora;

import java.util.logging.Logger;

public class Calculator {

    private int current;
    private Logger logger;

    public Calculator() {
        this.logger = Logger.getLogger(Calculator.class.getSimpleName());
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public void sum(int operand) {
        this.current += operand;
        this.logger.info("Result of sum operation: " + this.current);
    }

    public void subtract(int operand) {
        this.current -= operand;
        this.logger.info("Result of subtraction operation: " + this.current);
    }

    public void multiply(int operand) {
        this.current *= operand;
        this.logger.info("Result of multiplication operation: " + this.current);
    }

    public void divide(int operand) {
        this.current /= operand;
        this.logger.info("Result of division operation: " + this.current);
    }
}
