package com.example.hrms.Entities.Concretes;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "job_seekers_cv")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_seekers_cv"})
public class JobSeekerCv {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "github")
	@NotBlank
	@NotNull
	private String github;

	@Column(name = "linkedln")
	@NotBlank
	@NotNull
	private String linkedln;
	
	@NotBlank
	@NotNull
	@Column(name = "cover_letter")
	private String coverLetter;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="job_experience_id")
	private JobExperience experiences;
	
	@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name="language_id")
	private Language languages;
	
	@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name="programing_languages_id")
	private ProgramingLanguage programingLanguages;
	
	@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name="university_id")
	private University university;
	
	@OneToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	@JoinColumn(name="job_seeker_id")
	private JobSeeker jobSeeker;


	
	
}
