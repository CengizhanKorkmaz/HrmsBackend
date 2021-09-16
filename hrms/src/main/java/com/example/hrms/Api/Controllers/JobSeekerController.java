package com.example.hrms.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.Business.Abstracts.JobSeekerService;
import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Entities.Concretes.JobSeeker;

@RestController
@RequestMapping("api/jobseeker/")
public class JobSeekerController {

	@Autowired
	private JobSeekerService jobSeekerService;
	
	public JobSeekerController(JobSeekerService jobSeekerService) {
		this.jobSeekerService = jobSeekerService;
	}
	
	@PostMapping("add")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		return this.jobSeekerService.add(jobSeeker);
	}
	
	@GetMapping("getall")
	public DataResult<List<JobSeeker>> getAll(){
		return this.jobSeekerService.getAll();
	}
}
