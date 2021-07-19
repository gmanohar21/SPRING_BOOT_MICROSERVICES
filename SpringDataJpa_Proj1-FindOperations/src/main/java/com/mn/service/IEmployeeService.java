package com.mn.service;

import java.util.List;
import java.util.Optional;

import com.mn.model.Employee;

/*	Optional<T> findById(ID id);
Iterable<T> findAllById(Iterable<ID> ids);
boolean existsById(ID id);
long count();	
Iterable<T> findAll();*/
public interface IEmployeeService {

	public String saveEmp(Employee emp);

	public Iterable<Employee> batchProcess(Iterable<Employee> emp);

	public long getEmployeeCount();

	public Optional<Employee> findById(Integer id);

	public Iterable<Employee> findAllData();

	public boolean checkEmployeepresent(long id);

	public Iterable<Employee> findAllDataByIds(Iterable<Integer> ids);

	public Optional<Employee> empCheck(Integer id);

	

}
