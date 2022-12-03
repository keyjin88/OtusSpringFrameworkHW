package ru.vavtech.hw01.service.io;

import lombok.RequiredArgsConstructor;

import java.io.PrintStream;

@RequiredArgsConstructor
public class ConsoleIOService implements IOService {
    private final PrintStream out;

    @Override
    public void printString(String message) {
        out.println(message);
    }
}
