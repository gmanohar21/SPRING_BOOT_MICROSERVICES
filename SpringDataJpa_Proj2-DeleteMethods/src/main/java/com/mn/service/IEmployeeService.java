package com.mn.service;

import com.mn.model.Employee;

public interface IEmployeeService {

	public String deleteById(Integer id);
	public String delete(Employee emp);
	public String deleteAll();
	public String deleteAllVacByIds(Iterable<Integer> ids);
	public String deleteAllVac(Iterable<Employee> emp);
	
	
}
