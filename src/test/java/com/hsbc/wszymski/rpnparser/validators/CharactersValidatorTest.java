package com.hsbc.wszymski.rpnparser.validators;

import com.hsbc.wszymski.rpnparser.MathOperator;
import com.hsbc.wszymski.rpnparser.ReversePolishNotationParser;
import com.hsbc.wszymski.rpnparser.ReversePolishNotationParserImpl;
import org.junit.Before;
import org.junit.Test;

public class CharactersValidatorTest {

    private ReversePolishNotationParser parser;

    @Before
    public void init() {
        parser = new ReversePolishNotationParserImpl();
    }

    @Test
    public void test_defaultOperators() {
        InputValidator validator = new CharactersValidator(parser);
        validator.validate("12 1 +");
        validator.validate("2 1 -");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_notSupportedOperators() {
        InputValidator validator = new CharactersValidator(parser);
        validator.validate("12 1 *");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_notSupportedOperators2() {
        InputValidator validator = new CharactersValidator(parser);
        validator.validate("12 1 /");
    }

    @Test
    public void test_withAdditionalOperators() {
        parser.addOperator(MathOperator.MUL);
        parser.addOperator(MathOperator.DIV);
        InputValidator validator = new CharactersValidator(parser);
        validator.validate("15 7 1 1 + - / 3 * 2 1 1 + + -");
    }

}
