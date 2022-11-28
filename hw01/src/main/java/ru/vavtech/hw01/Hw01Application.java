package ru.vavtech.hw01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vavtech.hw01.service.ExamRunner;

public class Hw01Application {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("/spring-context.xml");
        var examRunner = context.getBean(ExamRunner.class);
        examRunner.test();
        context.close();
    }

}
