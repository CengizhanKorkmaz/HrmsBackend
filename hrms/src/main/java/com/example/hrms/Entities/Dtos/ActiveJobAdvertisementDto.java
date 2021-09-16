package com.example.hrms.Entities.Dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiveJobAdvertisementDto {

	private int id;
	private String companyName;
	private int numberOfPositions;
	private Date releaseDate;
	private Date applicationDeadline;

	
}
