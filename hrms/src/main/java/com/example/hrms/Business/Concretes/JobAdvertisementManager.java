package com.example.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.Business.Abstracts.JobAdvertisementService;
import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Core.Utilities.Results.SuccessDataResult;
import com.example.hrms.Core.Utilities.Results.SuccessResult;
import com.example.hrms.DataAccess.Abstracts.JobAdvertisementDao;
import com.example.hrms.Entities.Concretes.JobAdvertisement;
import com.example.hrms.Entities.Dtos.ActiveJobAdvertisementDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	@Autowired
	private JobAdvertisementDao jobAdvertisementDao;
	public JobAdvertisementManager(JobAdvertisementDao advertisementDao) {
		
		this.jobAdvertisementDao = advertisementDao;
	}
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Data kaydedildi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"Data getirildi.");
	}

	@Override
	public DataResult<List<ActiveJobAdvertisementDto>> findByActiveJobAdvertisement() {
		return new SuccessDataResult<List<ActiveJobAdvertisementDto>>(this.jobAdvertisementDao.findByActiveJobAdvertisement(),"Data getirildi.");
	}
	@Override
	public DataResult<List<JobAdvertisement>> findByStartDateBefore() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findByStartDateBefore(),"Data getirildi.");
	}
	@Override
	public DataResult<List<JobAdvertisement>> findByEmployerId(int id) {
	
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findByEmployerId(id),"Data getirildi.");
	}

}
