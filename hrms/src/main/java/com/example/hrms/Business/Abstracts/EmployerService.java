package com.example.hrms.Business.Abstracts;

import java.util.List;

import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Entities.Concretes.Employer;

public interface EmployerService {

	Result add(Employer employer);
	void updateAdvertStatusFalse(int id);
	void updateAdvertStatusTrue(int id);

	DataResult<List<Employer>> getAll();
}
