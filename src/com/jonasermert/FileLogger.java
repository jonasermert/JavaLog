package com.jonasermert;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger implements ILogger {

    private final String fileName;
    private final ConsoleLogger console;

    public FileLogger(String fileName) {
        this.console = new ConsoleLogger();
        this.fileName = fileName;
    }

    @Override
    public void write(String s) {
        try
                (
                        FileWriter fw = new FileWriter(fileName, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter out = new PrintWriter(bw)
                )
        {

            console.write(s);
            out.print(s);

        } catch (IOException e) {
            console.writeLine("Fehler beim schreiben der Logdatei " + fileName);
        }
    }

    @Override
    public void writeLine(String s) {
        try
                (
                        FileWriter fw = new FileWriter(fileName, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter out = new PrintWriter(bw)
                )
        {

            console.writeLine(s);
            out.println(s);

        } catch (IOException e) {
            console.writeLine("Fehler beim schreiben der Logdatei " + fileName);
        }
    }

}