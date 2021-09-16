package com.example.hrms.Business.Abstracts;

import java.util.List;

import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Entities.Concretes.JobAdvertisement;
import com.example.hrms.Entities.Dtos.ActiveJobAdvertisementDto;

public interface JobAdvertisementService {

	Result add(JobAdvertisement jobAdvertisement);
	
	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<List<ActiveJobAdvertisementDto>> findByActiveJobAdvertisement();
	
	DataResult<List<JobAdvertisement>> findByStartDateBefore();
	
	DataResult<List<JobAdvertisement>> findByEmployerId(int id);
}
