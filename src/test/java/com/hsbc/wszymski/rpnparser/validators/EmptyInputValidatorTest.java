package com.hsbc.wszymski.rpnparser.validators;

import org.junit.Test;

public class EmptyInputValidatorTest {

    private InputValidator validator = new EmptyInputValidator();

    @Test
    public void simpleTest() {
        validator.validate("15 2 +");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_emptyString() {
        validator.validate("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_nullInput() {
        validator.validate(null);
    }

}
