package com.example.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.Business.Abstracts.JobSeekerCvService;
import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Core.Utilities.Results.SuccessDataResult;
import com.example.hrms.Core.Utilities.Results.SuccessResult;
import com.example.hrms.DataAccess.Abstracts.JobSeekerCvDao;
import com.example.hrms.Entities.Concretes.JobSeekerCv;

@Service
public class JobSeekerCvManager implements JobSeekerCvService {

	@Autowired
	private JobSeekerCvDao jobSeekerCvDao;
	
	public JobSeekerCvManager(JobSeekerCvDao cvDao) {
		
		this.jobSeekerCvDao = cvDao;
	}

	@Override
	public Result add(JobSeekerCv jobSeekerCv) {
		this.jobSeekerCvDao.save(jobSeekerCv);
		return new SuccessResult("Data kaydedildi.");
	}

	@Override
	public DataResult<List<JobSeekerCv>> getAll() {
		return new SuccessDataResult<List<JobSeekerCv>>(this.jobSeekerCvDao.findAll(), "Data getirildi.");
	}
	
	
}
