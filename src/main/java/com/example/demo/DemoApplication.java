package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmploRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private EmploRepository emploRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Your code logic for command line runner
		Employee employee =new Employee();
		employee.setFirstName("Ajay");
		employee.setLastName("kumar");
		employee.setEmailId("ajay.w@gmail.com");
		emploRepository.save(employee);
		Employee employee1 =new Employee();
		employee1.setFirstName("gyan");
		employee1.setLastName("kaushik");
		employee1.setEmailId("gyan.k@gmail.com");
		emploRepository.save(employee1);

	}
}
