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

@Entity
@Data
@Table(name="universitys")
@AllArgsConstructor
@NoArgsConstructor
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="university_name")
	@NotBlank(message = "Üniversite adı zorunludur.")
	@NotNull
	private String universityName;
	
	@Column(name="deparment")
	@NotBlank(message = "Bölüm adı zorunludur.")
	@NotNull
	private String deparment;
	
	@Column(name="starting_date")
	@NotBlank(message = "Giriş tarihi zorunludur.")
	@NotNull
	private Date startingDate;
	
	@Column(name="completion_date")
	private Date completionDate;

	

	
}
