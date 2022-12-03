package ru.vavtech.hw02;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vavtech.hw02.service.ExamRunner;

public class Hw02Application {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("/spring-context.xml");
        var examRunner = context.getBean(ExamRunner.class);
        examRunner.test();
        context.close();
    }

}
