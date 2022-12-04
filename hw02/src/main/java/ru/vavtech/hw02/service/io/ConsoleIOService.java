package ru.vavtech.hw02.service.io;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleIOService implements IOService {
    private final PrintStream out;
    private final Scanner in;

    public ConsoleIOService(PrintStream out, InputStream in) {
        this.out = out;
        this.in = new Scanner(in);
    }

    @Override
    public void printString(String message) {
        out.println(message);
    }

    @Override
    public String readString() {
        return in.nextLine();
    }
}
