package com.hsbc.wszymski.rpnparser.writers;

public class OutputWriterStrategy {

    private final OutputWriter writer;

    public OutputWriterStrategy(OutputWriter writer) {
        this.writer = writer;
    }

    public void write(String output) {
        writer.write(output);
    }

}
