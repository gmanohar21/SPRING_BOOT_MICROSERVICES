package com.mn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.mn.model.Employeee;
import com.mn.repo.IEmployeeRepo;

@Service("EmployeeService")
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private IEmployeeRepo repo;

	@Override
	public Iterable<Employeee> fetchDetails(boolean asc, String... properties) {
		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC, properties);
		Iterable<Employeee> AllEntities = repo.findAll(sort);
		return AllEntities;
	}

	@Override
	public Iterable<Employeee> pageDtls(Integer pageNo, Integer pageSize, boolean asc, String... props) {
		Pageable page = PageRequest.of(pageNo, pageSize, asc ? Direction.ASC : Direction.DESC, props);
		Page<Employeee> pages = repo.findAll(page);
		return pages.getContent();
	}

}
