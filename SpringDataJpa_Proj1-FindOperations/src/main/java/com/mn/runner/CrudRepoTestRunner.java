package com.mn.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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

		// Bulk Insertion

		Iterable<Employee> emps = service.batchProcess(Arrays.asList(new Employee(1, "Arya", 25),
				new Employee(2, "Mrya", 26), new Employee(3, "Grya", 27), new Employee(4, "Sarya", 28)));

		emps.forEach(emp -> System.out.println(emp.getName()));
		System.out.println(service.getEmployeeCount());// to count the employee
		System.out.println(service.findById(3));// to fetch employee
		System.out.println(service.checkEmployeepresent(4));// to check employee is present
		Iterable<Employee> listemp = service.findAllData();
		/*listemp.forEach(emp -> {
			System.out.println(emp);
		});//1st way
		*/
		// listemp.forEach(emp -> System.out.println(emp));// 2nd way
		service.findAllData().forEach(System.out::println);// 3rd way for each with method reference

		/*
		 * try { Employee emp = new Employee(null, "clrmanu", 15);
		 * System.out.println(service.saveEmp(emp)); } catch (DataAccessException e) {
		 * e.printStackTrace(); } catch (Exception e) { e.printStackTrace(); }
		 */
		Iterable<Employee> listemps = service.findAllDataByIds(List.of(3, 4, 5));
		service.findAllDataByIds(List.of(3, 4, 5)).forEach(emp -> System.out.println(emp));

Optional<Employee> emp= service.empCheck(3);
		if (emp.isPresent()) {
			System.out.println("CrudRepoTestRunner.run() -- optional");
			System.out.println(emp);
		}

	}
}
