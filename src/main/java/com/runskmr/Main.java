package com.runskmr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Main {

	//db

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(Main.class, args);

	}

}
