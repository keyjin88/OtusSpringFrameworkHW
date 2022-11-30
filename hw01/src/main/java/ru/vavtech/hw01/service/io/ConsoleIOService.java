package ru.vavtech.hw01.service.io;

import lombok.RequiredArgsConstructor;
import ru.vavtech.hw01.model.Question;

import java.io.PrintStream;
import java.text.MessageFormat;

@RequiredArgsConstructor
public class ConsoleIOService implements IOService {
    private final PrintStream out;

    @Override
    public void printQuestionWithAnswer(Question question) {
        out.println(MessageFormat.format("Question: \"{0}\", Right answer: \"{1}\"", question.getQuestion(), question.getCorrectAnswer()));
    }
}
