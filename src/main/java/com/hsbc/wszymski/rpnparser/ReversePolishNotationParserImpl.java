package com.hsbc.wszymski.rpnparser;

import java.util.HashSet;
import java.util.Stack;

public class ReversePolishNotationParserImpl implements ReversePolishNotationParser {

    private HashSet<String> operators = new HashSet();

    public ReversePolishNotationParserImpl() {
        // Parser has to handle 2 kinds of arithmetical operations (addition and subtraction)
        operators.add(MathOperator.PLUS.getOperator());
        operators.add(MathOperator.MINUS.getOperator());
    }

    public int reversePolishNotation(String input) {
        Stack<Integer> stack = new Stack();

        String[] chars = input.split("\\s+");
        for (String ch : chars) {
            if (!operators.contains(ch)) {
                stack.push(Integer.valueOf(ch));
            } else {
                Integer operand2 = stack.pop();
                Integer operand1 = stack.pop();
                stack.push(calculate(ch, operand1, operand2));
            }
        }
        return stack.pop();
    }

    public void addOperator(MathOperator operator) {
        operators.add(operator.getOperator());
    }

    @Override
    public HashSet<String> getOperators() {
        return operators;
    }

    private int calculate(String operator, Integer operand1, Integer operand2) {
        if (MathOperator.PLUS.getOperator().equals(operator)) return operand1 + operand2;
        if (MathOperator.MINUS.getOperator().equals(operator)) return operand1 - operand2;
        if (MathOperator.MUL.getOperator().equals(operator)) return operand1 * operand2;
        if (MathOperator.DIV.getOperator().equals(operator)) return operand1 / operand2;
        return 0;
    }

}
