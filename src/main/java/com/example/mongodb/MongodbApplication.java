package com.example.mongodb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
//@ComponentScan("com.example.mongodb.repository") //to scan packages mentioned
//@EnableMongoRepositories("com.example.mongodb.repository")
public class MongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}



}
