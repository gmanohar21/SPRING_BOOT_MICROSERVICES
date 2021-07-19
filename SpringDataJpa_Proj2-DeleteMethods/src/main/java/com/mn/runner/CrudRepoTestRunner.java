package com.mn.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mn.model.Employee;
import com.mn.service.IEmployeeService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			// delete by object
			Employee emp = new Employee();
			emp.setId(5);
			System.out.println(service.delete(emp));

		} catch (Exception e1) {
			System.out.println("CrudRepoTestRunner.run()");
			e1.printStackTrace();
		}
		try {

			System.out.println(service.deleteById(4));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			// System.out.println(service.deleteAll());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			// System.out.println(service.deleteAllVacByIds(List.of(1, 2)));
			// System.out.println("CrudRepoTestRunner.run()");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			// System.out.println(service.deleteAllVacByIds(List.of(1, 2)));
			// System.out.println("CrudRepoTestRunner.run()");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			List<Employee> emp = new ArrayList<>();//storing object in list
			System.out.println(service.deleteAllVac(emp));
			System.out.println("CrudRepoTestRunner.run()");
		} catch (Exception e) {
			System.out.println("CrudRepoTestRunner.run()");
			e.printStackTrace();
		}
	}

}
