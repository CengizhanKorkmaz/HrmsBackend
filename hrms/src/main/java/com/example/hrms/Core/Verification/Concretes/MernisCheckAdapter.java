package com.example.hrms.Core.Verification.Concretes;



import org.springframework.stereotype.Service;

import com.example.hrms.Core.Verification.Abstracts.MernisCheckService;
import com.example.hrms.Entities.Concretes.JobSeeker;
@Service
public class MernisCheckAdapter implements MernisCheckService{

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		return true;
	}

}
