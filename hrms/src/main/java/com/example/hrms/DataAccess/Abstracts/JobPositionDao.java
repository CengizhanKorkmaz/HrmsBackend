package com.example.hrms.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.Entities.Concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

}
