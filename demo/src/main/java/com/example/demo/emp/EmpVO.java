package com.example.demo.emp;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

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
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") //입력 string -> Date
	@JsonFormat(pattern = "yyyy-MM-dd") //출력 Date -> string
	Date hireDate;
	Integer salary;
	String jobId;
	@JsonProperty(value = "deptId")String departmentId;
	@JsonIgnore String managerId;
	@JsonIgnore String phone;
//	int start = 1;
//	int end = 10;
//	
//	int[] employeeIds;
}
