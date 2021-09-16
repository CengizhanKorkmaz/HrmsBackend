package com.example.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.Business.Abstracts.EmployeeService;
import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Core.Utilities.Results.SuccessDataResult;
import com.example.hrms.Core.Utilities.Results.SuccessResult;
import com.example.hrms.DataAccess.Abstracts.EmployeeDao;
import com.example.hrms.Entities.Concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;
	public EmployeeManager(EmployeeDao dao) {
		this.employeeDao = dao;
	}
	@Override
	public Result add(Employee employee) {
		
		this.employeeDao.save(employee);
		return new SuccessResult("Data kaydedildi.");
	}

	@Override
	public DataResult<List<Employee>> getAll() {

		return  new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(), "Datalar getirildi.");
	}

}
