package com.jonasermert;

public class ConsoleLogger implements ILogger {

    @Override
    public void write(String s) {
        System.out.print(s);
    }

    @Override
    public void writeLine(String s) {
        System.out.println(s);
    }

}
