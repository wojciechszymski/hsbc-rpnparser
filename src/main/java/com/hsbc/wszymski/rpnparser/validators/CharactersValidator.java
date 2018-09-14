package com.hsbc.wszymski.rpnparser.validators;

import com.hsbc.wszymski.rpnparser.ReversePolishNotationParser;

import java.util.HashSet;

public class CharactersValidator implements InputValidator {

    private HashSet<String> operators;

    public CharactersValidator(ReversePolishNotationParser parser) {
        operators = parser.getOperators();
    }

    @Override
    public void validate(String input) {
        String[] chars = input.split("\\s+");
        for (String ch : chars) {
            if (!operators.contains(ch) && !ch.matches("(\\d+)")) {
                throw new IllegalArgumentException("Operator not supported");
            }
        }
    }

}
