package com.comp.empwebapp.dto;

import lombok.Data;
import lombok.ToString.Exclude;

@Data	// annotation for all data present in lombok.
public class EmployeeInfo {

	private int id;
	private String name;
	private String email;
//	@Exclude to exclude password to other
	private String password;
}
