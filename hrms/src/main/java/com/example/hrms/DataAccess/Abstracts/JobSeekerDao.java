package com.example.hrms.DataAccess.Abstracts;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.hrms.Entities.Concretes.JobSeeker;


public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{

}
