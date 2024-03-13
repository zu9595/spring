package com.example.demo.emp;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmpVO {
	int employeeId;
	String firstName;
	String lastName;
	String email;
	Date hireDate;
	Integer salary;
	String jobId;
	String departmentId;
	String managerId;
//	int start = 1;
//	int end = 10;
//	
//	int[] employeeIds;
}
