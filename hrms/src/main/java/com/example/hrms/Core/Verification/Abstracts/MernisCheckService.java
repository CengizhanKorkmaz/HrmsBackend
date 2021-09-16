package com.example.hrms.Core.Verification.Abstracts;

import com.example.hrms.Entities.Concretes.JobSeeker;

public interface MernisCheckService {

	boolean checkIfRealPerson(JobSeeker jobSeeker);
}
