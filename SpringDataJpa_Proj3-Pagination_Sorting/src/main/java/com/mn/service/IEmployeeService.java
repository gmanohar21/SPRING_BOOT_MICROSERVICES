package com.mn.service;

import org.springframework.stereotype.Service;

import com.mn.model.Employeee;

@Service
public interface IEmployeeService {
	public Iterable<Employeee> fetchDetails(boolean asc, String... properties);

	public Iterable<Employeee> pageDtls(Integer pageNo, Integer pageSize, boolean asc, String... props);
}
