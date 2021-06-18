package com.authservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Indv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "indv_id", unique = true, nullable = false)
	private Integer indvId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String fathersName;
	private Long contactNumber;
	
}
