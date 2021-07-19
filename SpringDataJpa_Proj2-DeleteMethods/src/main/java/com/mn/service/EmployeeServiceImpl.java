package com.mn.service;

import java.util.ArrayList;
import java.util.List;
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
	public String deleteById(Integer id) {
		Optional<Employee> opt = repo.findById(id);
		if (opt.isPresent()) {
			repo.deleteById(id);
			return "record deleted" + id;
		} else
			return "Record not fount" + id;
	}

	@Override
	public String delete(Employee emp) {
		Optional<Employee> opt = repo.findById(emp.getId());
		if (opt.isPresent()) {
			return "record deleted ";
		}
		return "Not present";
	}

	@Override
	public String deleteAll() {
		long count = repo.count();
		if (count != 0) {
			repo.deleteAll();
			return count + "deleted";
		} else {
			return count + "nothing deleted";
		}

	}

	@Override
	public String deleteAllVac(Iterable<Employee> emp) {
		long count = repo.count();
		if (count != 0) {
			repo.deleteAll(emp);
			return count + "emp deleted";
		} else {
			return "no record deleted";
		}
	}

	@Override
	public String deleteAllVacByIds(Iterable<Integer> ids) {
		Iterable<Employee> ite = repo.findAllById(ids);
		if (ite != null) {
			repo.deleteAllById(ids);
			return "deleted";
		} else {
			return "not deleted";
		}
	}

}
