package com.example.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.Business.Abstracts.JobPositionService;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Core.Utilities.Results.SuccessDataResult;
import com.example.hrms.Core.Utilities.Results.SuccessResult;
import com.example.hrms.DataAccess.Abstracts.JobPositionDao;
import com.example.hrms.Entities.Concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	@Autowired
	private JobPositionDao jobPositionDao;
	public JobPositionManager(JobPositionDao dao) {
		this.jobPositionDao = dao;
	}
	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("Data kaydedildi.");
	}

	@Override
	public SuccessDataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(), "Data getirildi.");
	}

}
