package com.example.hrms.Api.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.Business.Abstracts.JobSeekerCvService;
import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Entities.Concretes.JobSeekerCv;

@RestController
@RequestMapping("api/jobseekercv/")
public class JobSeekerCvController {

	private JobSeekerCvService jobSeekerCvService;
	
	public JobSeekerCvController(JobSeekerCvService cvService) {
		
		this.jobSeekerCvService = cvService;
	}
	
	@PostMapping("add")
	public Result add(@RequestBody JobSeekerCv cv) {
		
		return this.jobSeekerCvService.add(cv);

	}
	
	@GetMapping("getall")
	public DataResult<List<JobSeekerCv>> getAll(){
		return this.jobSeekerCvService.getAll();
	}
}
