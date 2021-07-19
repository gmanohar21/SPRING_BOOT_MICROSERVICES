package com.mn.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mn.model.Employee;
import com.mn.repo.IEmployeeRepo;

@Service("EmployeeService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepo repo;

	@Override
	public String saveEmp(Employee emp) {
		System.out.println("EmployeeServiceImpl.saveEmp()");
		Employee Empsave = repo.save(emp);
		return Empsave != null ? "resistered success" + Empsave.getId() : "reg failed";
	}

	@Override
	public Iterable<Employee> batchProcess(Iterable<Employee> emp) {

		return repo.saveAll(emp);
	}

	@Override
	public long getEmployeeCount() {
		return repo.count();
	}

	@Override
	public Optional<Employee> findById(Integer id) {
		System.out.println("EmployeeServiceImpl.findById()");
		return repo.findById(4);
	}

	@Override
	public Iterable<Employee> findAllData() {
		return repo.findAll();
	}

	@Override
	public boolean checkEmployeepresent(long id) {
		return repo.existsById((int) id);
	}

	@Override
	public Iterable<Employee> findAllDataByIds(Iterable<Integer> ids) {
		return repo.findAllById(ids);
	}
	@Override
	public Optional<Employee> empCheck(Integer id) {
		return repo.findById(id);
	}


}
