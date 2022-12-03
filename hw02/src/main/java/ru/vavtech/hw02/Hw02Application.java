package ru.vavtech.hw02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.vavtech.hw02.service.ExamRunner;
@ComponentScan("ru.vavtech.hw02")
public class Hw02Application {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Hw02Application.class);
        var examRunner = context.getBean(ExamRunner.class);
        examRunner.test();
        context.close();
    }

}
