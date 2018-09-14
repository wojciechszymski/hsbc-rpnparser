package com.hsbc.wszymski.rpnparser;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversePolishNotationParserImplTest {

    private ReversePolishNotationParser parser;

    @Before
    public void init() {
        parser = new ReversePolishNotationParserImpl();
        parser.addOperator(MathOperator.MUL);
        parser.addOperator(MathOperator.DIV);
    }

    @Test
    public void test() {
        assertEquals(2, parser.reversePolishNotation("1 1 +"));
        assertEquals(1, parser.reversePolishNotation("2 1 -"));
        assertEquals(8, parser.reversePolishNotation("2 4 *"));
        assertEquals(2, parser.reversePolishNotation("6 3 /"));
        assertEquals(9, parser.reversePolishNotation("3 11 + 5 -"));
        assertEquals(18, parser.reversePolishNotation("2 3 11 + 5 - *"));
        assertEquals(5, parser.reversePolishNotation("15 7 1 1 + - / 3 * 2 1 1 + + -"));
    }

}
