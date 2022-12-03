package ru.vavtech.hw01.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class Question {
    private String question;
    private String correctAnswer;
}
