package com.mn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaProj1Application {

	public static void main(String[] args) {
	// get acces to ioc container
		
		ApplicationContext ctx = SpringApplication.run(SpringDataJpaProj1Application.class, args);
		// get service class obj
		/*		System.out.println("SpringDataJpaProj1Application.main(1)");
		IEmployeeService employeeService = ctx.getBean("EmployeeService", IEmployeeService.class);
		try {
			Employee emp = new Employee(1, "manu", 12);
			System.out.println(employeeService.saveEmp(emp));
		} catch (DataAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}*/

	}

}
