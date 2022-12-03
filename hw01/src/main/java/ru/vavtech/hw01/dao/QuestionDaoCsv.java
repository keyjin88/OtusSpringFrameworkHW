package ru.vavtech.hw01.dao;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.springframework.core.io.ClassPathResource;
import ru.vavtech.hw01.exceptions.QuestionsReadException;
import ru.vavtech.hw01.model.Question;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
public class QuestionDaoCsv implements QuestionDAO {
    private final String path;

    public List<Question> getQuestions() {
        try (var inputStreamReader = new InputStreamReader(new ClassPathResource(path).getInputStream())) {
            var csvParser = new CSVParser(inputStreamReader, CSVFormat.Builder.create()
                    .setIgnoreEmptyLines(false)
                    .setAllowMissingColumnNames(true)
                    .setDelimiter(';')
                    .build());
            return csvParser.getRecords().stream().map(record -> new Question(record.get(0), record.get(1)))
                    .collect(Collectors.toCollection(ArrayList::new));
        } catch (Exception exception) {
            log.error("getQuestions error: {}", exception.getMessage());
            throw new QuestionsReadException("Can't read file with questions.", exception);
        }
    }
}
