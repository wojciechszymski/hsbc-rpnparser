package com.hsbc.wszymski.rpnparser;

import java.util.HashSet;

public interface ReversePolishNotationParser {

    int reversePolishNotation(String input);

    void addOperator(MathOperator operator);

    HashSet<String> getOperators();

}
