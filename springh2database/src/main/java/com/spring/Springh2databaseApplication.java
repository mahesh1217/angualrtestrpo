package com.spring;

/*import org.modelmapper.ModelMapper;*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.spring.repository.EmployeeRepository;


@SpringBootApplication
public class Springh2databaseApplication  {
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
    @Autowired
    private EmployeeRepository employeeRepository;

 


	public static void main(String[] args) {
		SpringApplication.run(Springh2databaseApplication.class, args);
	}

}
