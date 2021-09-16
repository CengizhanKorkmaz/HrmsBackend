package com.example.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.Business.Abstracts.EmployerService;
import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Core.Utilities.Results.SuccessDataResult;
import com.example.hrms.Core.Utilities.Results.SuccessResult;
import com.example.hrms.DataAccess.Abstracts.EmployerDao;
import com.example.hrms.Entities.Concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	@Autowired
	private EmployerDao employerDao;
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}
	@Override
	public Result add(Employer employer) {
		 this.employerDao.save(employer);
		 return new SuccessResult("Data kaydedildi.");
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data getirildi.");
	}
	@Override
	public void updateAdvertStatusFalse(int id) {
		
		this.employerDao.updateAdvertStatusFalse(id);
		
	}
	@Override
	public void updateAdvertStatusTrue(int id) {
		
		this.employerDao.updateAdvertStatusTrue(id);
		
	}


}
