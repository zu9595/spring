package com.example.demo.emp;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmpVO {
	int employeeId;
	String firstName;
	String lastName;
	String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	Date hireDate;
	Integer salary;
	String jobId;
	String departmentId;
	String managerId;
	String photo;
	String phone;
//	int start = 1;
//	int end = 10;
//	
//	int[] employeeIds;
}
