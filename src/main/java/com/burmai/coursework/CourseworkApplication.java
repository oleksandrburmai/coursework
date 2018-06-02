package com.burmai.coursework;

import com.burmai.coursework.service.NotebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CourseworkApplication {

    public static void main(String[] args) {

        SpringApplication.run(CourseworkApplication.class, args);
    }
}
