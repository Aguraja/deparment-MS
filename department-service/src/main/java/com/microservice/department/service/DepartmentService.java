package com.microservice.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.department.entity.Department;
import com.microservice.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		System.out.println("inside saveDepartment Service");
		return departmentRepository.save(department);
	}

	public Department findDepartment(Long departmentId) {
		return departmentRepository.findByDepartmentId(departmentId);
	}

}
