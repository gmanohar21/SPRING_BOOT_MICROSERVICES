package com.example.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.example.demo.dto.StudentDto;

public interface TestService {
	public String Name();

	public Long EmpId();

	public String[] nickName();

	public List<String> teamMembers();

	public Set<Long> phoneNo();

	public Map<String, Object> idDetails();

	public List<StudentDto> allData();
}
