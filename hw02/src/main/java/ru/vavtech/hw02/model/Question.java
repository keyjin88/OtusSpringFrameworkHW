package ru.vavtech.hw02.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Question {
    private String question;
    private String correctAnswer;
}
