package com.example.hrms.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.Entities.Concretes.City;

public interface CityDao extends JpaRepository<City, Integer>{

	
}
