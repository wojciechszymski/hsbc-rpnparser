package com.hsbc.wszymski.rpnparser.readers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainMethodParameterReaderTest {

    private InputReaderStrategy inputReader;

    @Test
    public void simpleTestWithOneArg() {
        // given
        inputReader = new InputReaderStrategy(new MainMethodParameterReader(new String[] {"15 2 +"}));
        // when
        String input = inputReader.getInput();
        // then
        assertEquals(input, "15 2 +");
    }

    @Test
    public void simpleTestWithMoreArgs() {
        // given
        inputReader = new InputReaderStrategy(new MainMethodParameterReader(new String[] {"15 2 +", "15 2 +", "15 2 +"}));
        // when
        String input = inputReader.getInput();
        // then
        assertEquals(input, "15 2 +");
    }

}
