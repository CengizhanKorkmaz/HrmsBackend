package com.example.hrms.Entities.Concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_experiences")
@AllArgsConstructor
@NoArgsConstructor
public class JobExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "company_name")
	@NotBlank(message = "Şirket adı zorunludur.")
	@NotNull
	private String companyName;
	
	@Column(name = "starting_date")
	@NotBlank(message = "Başlama tarihi zorunludur.")
	@NotNull
	private Date startingDate;
	
	@Column(name = "completionDate")
	private Date completionDate;


	
	
}
