package edu.wctc.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class DistJavaSpringBootAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistJavaSpringBootAssignmentApplication.class, args);
    }

}
