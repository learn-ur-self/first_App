package com.crud.crudoperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.crud.crudoperation.model.Employee;
import com.crud.crudoperation.repository.EmployeeRepository;

@SpringBootApplication
public class CrudOperationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudOperationApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
//	Employee employee=new Employee();
//	employee.setFirstName("venkat");
//	employee.setLastName("N");
//	employee.setEmailId("venkat@mail.com");
//	
//	employeeRepository.save(employee);
//	
//	Employee employee1=new Employee();
//	employee1.setFirstName("venkatesh");
//	employee1.setLastName("N");
//	employee1.setEmailId("venkat@mail.com");
//	
//	employeeRepository.save(employee1);
		
	}

}
