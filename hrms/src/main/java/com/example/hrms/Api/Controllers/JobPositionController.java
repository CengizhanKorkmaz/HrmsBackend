package com.example.hrms.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.Business.Abstracts.JobPositionService;
import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Entities.Concretes.JobPosition;

@RestController
@RequestMapping("api/jobposition/")
public class JobPositionController {

	@Autowired
	private JobPositionService jobPositionService;
	public JobPositionController(JobPositionService jobPositionService) {
		this.jobPositionService = jobPositionService;
	}
	
	@PostMapping("add")
	public Result add(@RequestBody JobPosition jobPosition) {
		
		return this.jobPositionService.add(jobPosition);
	}
	
	@GetMapping("getall")
	public DataResult<List<JobPosition>> getAll(){
		
		return jobPositionService.getAll();
	}
}
