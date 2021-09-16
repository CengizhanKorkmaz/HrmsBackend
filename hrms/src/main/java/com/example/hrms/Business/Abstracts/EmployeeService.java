package com.example.hrms.Business.Abstracts;

import java.util.List;

import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Entities.Concretes.Employee;

public interface EmployeeService {

	Result add(Employee employee);
	
	DataResult<List<Employee>> getAll();
	
}
