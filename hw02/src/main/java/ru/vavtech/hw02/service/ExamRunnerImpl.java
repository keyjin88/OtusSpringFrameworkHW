package ru.vavtech.hw02.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.vavtech.hw02.service.io.IOService;

@Component
@RequiredArgsConstructor
public class ExamRunnerImpl implements ExamRunner {

    private final ExamService examService;
    private final QuestionService questionService;
    private final IOService ioService;

    @Override
    public void examine() {
        var correctAnswersCount = 0;
        ioService.printString("Введите ваше имя и фамилию: ");
        var studentName = ioService.readString();
        ioService.printString(studentName);

        var allQuestions = questionService.getAllQuestions();
        for (var question : allQuestions) {
            ioService.printString(question.getQuestion());
            ioService.printString("Enter your answer: ");
            var answer = ioService.readString();
            if (examService.checkQuestion(question, answer)) {
                correctAnswersCount++;
            }
        }
        ioService.printString("Examination completed");
        ioService.printString("Your score: " + correctAnswersCount);
    }
}
