package com.example.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.Business.Abstracts.CityService;
import com.example.hrms.Core.Utilities.Results.DataResult;
import com.example.hrms.Core.Utilities.Results.Result;
import com.example.hrms.Core.Utilities.Results.SuccessDataResult;
import com.example.hrms.Core.Utilities.Results.SuccessResult;
import com.example.hrms.DataAccess.Abstracts.CityDao;
import com.example.hrms.Entities.Concretes.City;

@Service
public class CityManager implements CityService{

	@Autowired
	private CityDao cityDao;
	public CityManager(CityDao dao) {
		this.cityDao = dao;
	}
	@Override
	public Result add(City city) {
		
		this.cityDao.save(city);
		return new SuccessResult("Data kaydedildi.");
	}
	@Override
	public DataResult<List<City>> getAll() {
		
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"Datalar getirildi.");
	}
	
	
}
