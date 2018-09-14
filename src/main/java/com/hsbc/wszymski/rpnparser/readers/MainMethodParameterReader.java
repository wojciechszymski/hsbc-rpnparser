package com.hsbc.wszymski.rpnparser.readers;

public class MainMethodParameterReader implements InputReader {

    private final String[] args;

    public MainMethodParameterReader(String[] args) {
        this.args = args;
    }

    public String getInput() {
        if (args.length < 1) {
            return null;
        }
        return args[0];
    }

}
