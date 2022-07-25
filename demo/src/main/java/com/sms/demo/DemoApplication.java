package com.sms.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication {
@Autowired
private studentrepository StudentRes;
@Bean
public Supplier<List<Student>> students(){
	return ()->StudentRes.studentlist();
}
@Bean
public Function<String,List<Student>> finbyname(){

	return (input)->StudentRes.studentlist().stream().filter(student->student.getName().equals(input)).collect(Collectors.toList());

	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
