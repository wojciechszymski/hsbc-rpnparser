package com.hsbc.wszymski.rpnparser.writers;

public class ConsoleOutputWriter implements OutputWriter {

    public void write(String output) {
        System.out.print(output);
    }
}
