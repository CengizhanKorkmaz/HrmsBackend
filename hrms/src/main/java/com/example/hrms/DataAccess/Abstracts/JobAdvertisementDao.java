package com.example.hrms.DataAccess.Abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.hrms.Entities.Concretes.JobAdvertisement;
import com.example.hrms.Entities.Dtos.ActiveJobAdvertisementDto;


public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {

	@Query("Select new com.example.hrms.Entities.Dtos.ActiveJobAdvertisementDto"
			+ "(j.id,e.companyName,j.numberOfPositions,j.releaseDate,j.applicationDeadline)"
			+ "From JobAdvertisement j Inner Join j.employer e ")
	List<ActiveJobAdvertisementDto> findByActiveJobAdvertisement(); 
	
	@Query("From JobAdvertisement where applicationDeadline >= CURRENT_TIMESTAMP")
	List<JobAdvertisement> findByStartDateBefore();
	
	List<JobAdvertisement> findByEmployerId(int id);
}
