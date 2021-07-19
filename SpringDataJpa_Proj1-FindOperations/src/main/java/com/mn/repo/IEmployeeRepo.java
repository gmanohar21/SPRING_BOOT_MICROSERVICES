package com.mn.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mn.model.Employee;

public interface IEmployeeRepo extends CrudRepository<Employee, Integer> {
	
	/*	Optional<T> findById(ID id);
		Iterable<T> findAllById(Iterable<ID> ids);
		boolean existsById(ID id);
		long count();	
		Iterable<T> findAll();*/
}
