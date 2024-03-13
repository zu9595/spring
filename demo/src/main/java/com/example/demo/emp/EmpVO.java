package com.example.demo.emp;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
