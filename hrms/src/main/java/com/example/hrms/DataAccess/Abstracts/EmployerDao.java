package com.example.hrms.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.hrms.Entities.Concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

	@Transactional
	@Modifying(clearAutomatically = true, flushAutomatically = true)
	@Query("Update JobAdvertisement j Set j.advertStatus = false where j.id = :id ")
	void updateAdvertStatusFalse(@Param("id") int id);
	
	@Transactional
	@Modifying(clearAutomatically = true, flushAutomatically = true)
	@Query("Update JobAdvertisement j Set j.advertStatus = true where j.id = :id ")
	void updateAdvertStatusTrue(@Param("id") int id);
}
