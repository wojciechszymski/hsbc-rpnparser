package com.hsbc.wszymski.rpnparser.readers;

public class InputReaderStrategy {

    private final InputReader reader;

    public InputReaderStrategy(InputReader reader) {
        this.reader = reader;
    }

    public String getInput() {
        return reader.getInput();
    }

}
