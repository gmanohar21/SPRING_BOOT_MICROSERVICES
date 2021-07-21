package com.mn.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mn.model.Employeee;

public interface IEmployeeRepo extends PagingAndSortingRepository<Employeee, Integer> {

}
