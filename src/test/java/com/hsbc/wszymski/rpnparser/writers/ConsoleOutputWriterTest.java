package com.hsbc.wszymski.rpnparser.writers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ConsoleOutputWriterTest {

    private OutputWriterStrategy writer = new OutputWriterStrategy(new ConsoleOutputWriter());

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testOutput() {
        writer.write("5");
        assertEquals("5", outContent.toString());
    }


}
