package com.example.database_postgresql;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log
@SpringBootApplication
public class BookApiApplication {

    public static void main(String[] args) {
		SpringApplication.run(BookApiApplication.class, args);
	}

}
