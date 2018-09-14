package com.hsbc.wszymski.rpnparser.validators;

import org.apache.commons.lang.StringUtils;

public class EmptyInputValidator implements InputValidator {

    public void validate(String input) {
        if (StringUtils.isBlank(input)) {
            throw new IllegalArgumentException("Input is empty");
        }
    }
}
