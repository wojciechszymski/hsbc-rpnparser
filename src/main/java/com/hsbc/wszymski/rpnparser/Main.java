package com.hsbc.wszymski.rpnparser;

import com.hsbc.wszymski.rpnparser.readers.InputReaderStrategy;
import com.hsbc.wszymski.rpnparser.readers.MainMethodParameterReader;
import com.hsbc.wszymski.rpnparser.validators.CharactersValidator;
import com.hsbc.wszymski.rpnparser.validators.EmptyInputValidator;
import com.hsbc.wszymski.rpnparser.validators.InputStringValidator;
import com.hsbc.wszymski.rpnparser.writers.ConsoleOutputWriter;
import com.hsbc.wszymski.rpnparser.writers.OutputWriterStrategy;

public class Main {

    public static void main(String[] args) {
        ReversePolishNotationParser rpnParser = new ReversePolishNotationParserImpl();
        // but should be implemented in a way that allows to easily extend the number of supported operations (multiplication, division, etc.)
        rpnParser.addOperator(MathOperator.MUL);
        rpnParser.addOperator(MathOperator.DIV);

        // should be implemented in a way that allows to easily extend this (ie. to read RPN expression from file or database)
        InputReaderStrategy inputReader = new InputReaderStrategy(new MainMethodParameterReader(args));
        String input = inputReader.getInput();

        InputStringValidator validation = new InputStringValidator();
        validation.addValidator(new EmptyInputValidator());
        validation.addValidator(new CharactersValidator(rpnParser));
        validation.validate(input);

        int reversePolishNotationResult = rpnParser.reversePolishNotation(input);

        // should be implemented in a way that allows to easily extend this (ie. to write RPN expression evaluation result to file or database)
        OutputWriterStrategy writer = new OutputWriterStrategy(new ConsoleOutputWriter());
        writer.write(String.valueOf(reversePolishNotationResult));
    }


}
