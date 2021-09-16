package com.example.hrms.Api.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.Business.Abstracts.JobAdvertisementService;
import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Entities.Concretes.JobAdvertisement;
import com.example.hrms.Entities.Dtos.ActiveJobAdvertisementDto;

@RestController
@RequestMapping("api/jobadvertisementcontroller/")
public class JobAdvertisementController {

	private JobAdvertisementService jobAdvertisementService;
	
	public JobAdvertisementController(JobAdvertisementService advertisementService) {
		this.jobAdvertisementService = advertisementService;
	}
	
	@PostMapping("add")
	public Result add(@RequestBody JobAdvertisement advertisement) {
		return this.jobAdvertisementService.add(advertisement);
	}
	
	@GetMapping("getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("findByActiveJobAdvertisement")
	public DataResult<List<ActiveJobAdvertisementDto>> findByActiveJobAdvertisement(){
		
		return this.jobAdvertisementService.findByActiveJobAdvertisement();
	}
	
	@GetMapping("findByStartDateBefore")
	public DataResult<List<JobAdvertisement>> findByStartDateBefore(){
		return this.jobAdvertisementService.findByStartDateBefore();
	}
	
	@GetMapping("findByEmployerId")
	public DataResult<List<JobAdvertisement>> findByEmployerId(@RequestParam int id){
		
		return this.jobAdvertisementService.findByEmployerId(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
