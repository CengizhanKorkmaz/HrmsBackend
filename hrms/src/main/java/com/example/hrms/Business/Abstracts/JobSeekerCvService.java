package com.example.hrms.Business.Abstracts;

import java.util.List;

import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Entities.Concretes.JobSeekerCv;

public interface JobSeekerCvService {

	Result add(JobSeekerCv jobSeekerCv);
	DataResult<List<JobSeekerCv>> getAll();
}
