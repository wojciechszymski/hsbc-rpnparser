package com.hsbc.wszymski.rpnparser.validators;

import java.util.ArrayList;
import java.util.List;

public class InputStringValidator {

    private List<InputValidator> validators;

    public InputStringValidator() {
        this.validators = new ArrayList<InputValidator>();
    }

    public void addValidator(InputValidator validator) {
        validators.add(validator);
    }

    public void validate(String input) {
        for (InputValidator validator : validators) {
            validator.validate(input);
        }
    }

}
