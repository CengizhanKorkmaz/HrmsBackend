package com.example.hrms.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.Business.Abstracts.CityService;
import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Entities.Concretes.City;

@RestController
@RequestMapping("api/city/")
public class CityController {

	@Autowired
	private CityService cityService;
	public CityController(CityService service) {
		this.cityService = service;
	}
	
	@PostMapping("add")
	public Result add(@RequestBody City city) {
		
		return this.cityService.add(city);
	}
	
	@GetMapping("getall")
	public DataResult<List<City>> getAll(){
		
		return this.cityService.getAll();
	}
}
