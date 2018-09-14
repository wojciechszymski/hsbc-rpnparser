package com.hsbc.wszymski.rpnparser;

public enum MathOperator {

    PLUS("+"), MINUS("-"), MUL("*"), DIV("/");

    private String operator;

    public String getOperator() {
        return operator;
    }

    MathOperator(String operator) {
        this.operator = operator;
    }

}
