package com.example.hrms.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.Entities.Concretes.JobSeekerCv;

public interface JobSeekerCvDao extends JpaRepository<JobSeekerCv, Integer>{

}
