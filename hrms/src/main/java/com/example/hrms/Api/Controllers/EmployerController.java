package com.example.hrms.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.Business.Abstracts.EmployerService;
import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Entities.Concretes.Employer;

@RestController
@RequestMapping("api/employercontroller/")
public class EmployerController {
	
	@Autowired
	private EmployerService employerService;
	
	public EmployerController(EmployerService employerService) {
		this.employerService = employerService;
	}

	@PostMapping("add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}
	
	@GetMapping("getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	
	@GetMapping("updateAdvertStatusFalse")
	public void findByActiveFalse(@RequestParam int id) {
		
		this.employerService.updateAdvertStatusFalse(id);
	}
	
	@GetMapping("updateAdvertStatusTrue")
	public void findByActiveTrue(@RequestParam int id) {
		
		this.employerService.updateAdvertStatusTrue(id);
	}
 }
