package ru.vavtech.hw02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.vavtech.hw02.service.io.ConsoleIOService;
import ru.vavtech.hw02.service.io.IOService;

@Configuration
public class IOConfiguration {

    @Bean
    public IOService personDao() {
        return new ConsoleIOService(System.out, System.in);
    }
}
