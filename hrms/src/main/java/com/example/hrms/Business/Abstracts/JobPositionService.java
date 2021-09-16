package com.example.hrms.Business.Abstracts;

import java.util.List;

import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Entities.Concretes.JobPosition;

public interface JobPositionService {

	Result add(JobPosition jobPosition);
	DataResult<List<JobPosition>> getAll();
}
