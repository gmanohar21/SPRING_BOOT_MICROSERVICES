package com.mn.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mn.service.IEmployeeService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeService service;

	@Override
	public void run(String... args) throws Exception {
		/*		Iterable<Employeee> details;
				try {
					details = service.fetchDetails(true, "sal", "name");// for asc
					// details = service.fetchDetails(false, "sal", "name");//for desc
					details.forEach(System.out::println);
				} catch (Exception e) {
					e.printStackTrace();
				}*/
		service.pageDtls(1, 3, true, "sal").forEach(System.out::println);
		;

	}
}
