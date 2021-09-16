package com.example.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.Business.Abstracts.JobSeekerService;
import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Core.Utilities.Results.SuccessDataResult;
import com.example.hrms.Core.Utilities.Results.SuccessResult;
import com.example.hrms.Core.Verification.Abstracts.MernisCheckService;
import com.example.hrms.DataAccess.Abstracts.JobSeekerDao;
import com.example.hrms.Entities.Concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{

	@Autowired
	private JobSeekerDao jobSeekerDao;
	private MernisCheckService checkService;
	
	public JobSeekerManager(JobSeekerDao dao,MernisCheckService checkService) {
		this.jobSeekerDao = dao;
		this.checkService = checkService;
	}
	
	
	@Override
	public Result add(JobSeeker jobSeeker) {
		if (checkService.checkIfRealPerson(jobSeeker)) {
			 this.jobSeekerDao.save(jobSeeker);
			 return new SuccessResult("Data kaydedildi.");
		}
		else {
			System.out.println("Tc doğrulama yanlış");
		}
		return null;
		
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"Data getirildi.");
	}

}
