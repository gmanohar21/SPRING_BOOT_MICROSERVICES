package com.mn.repo;

import org.springframework.data.repository.CrudRepository;

import com.mn.model.Employee;

public interface IEmployeeRepo extends CrudRepository<Employee, Integer> {

}
