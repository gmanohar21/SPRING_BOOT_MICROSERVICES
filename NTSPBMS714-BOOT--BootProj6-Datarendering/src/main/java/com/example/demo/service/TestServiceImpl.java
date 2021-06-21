package com.example.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.example.demo.dto.StudentDto;

public class TestServiceImpl implements TestService {

	@Override
	public String Name() {

		return "manu";
	}

	@Override
	public Long EmpId() {
		// TODO Auto-generated method stub
		return 45678L;
	}

	@Override
	public String[] nickName() {
		// TODO Auto-generated method stub
		return new String[] { "vani", "mani", "rita" };
	}

	@Override
	public List<String> teamMembers() {
		// TODO Auto-generated method stub
		return List.of("kiran", "biran", "karan");
	}

	@Override
	public Set<Long> phoneNo() {
		// TODO Auto-generated method stub
		return Set.of(456L, 856L, 958L);
	}

	@Override
	public Map<String, Object> idDetails() {
		return Map.of("sara", "verr096", "doria", "maya");
	}

	public List<StudentDto> allData() {
		return List.of(new StudentDto(101, "manu", "hyd", 256.59f), new StudentDto(102, "vanu", "sce", 259.59f));

	}

}
