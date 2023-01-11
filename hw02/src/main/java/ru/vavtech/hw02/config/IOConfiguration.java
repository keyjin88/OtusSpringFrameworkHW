package ru.vavtech.hw02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.vavtech.hw02.service.io.IOServiceStream;
import ru.vavtech.hw02.service.io.IOService;

@Configuration
public class IOConfiguration {

    @Bean
    public IOService personDao() {
        return new IOServiceStream(System.out, System.in);
    }
}
