package com.example.demo.emp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.emp.EmpVO;
import com.example.demo.emp.SearchVO;

@Mapper
public interface EmpMapper {
	List<EmpVO> getEmpList(EmpVO vo, SearchVO svo); // EmpController에서 요청을 받으면 emp-mapper.xml에서 id=getEmpList 실행
	EmpVO getEmpInfo(int employeeId);
	int insertEmp(EmpVO empVO);
	int deleteEmp(int employeeId);
	List<Map<String, Object>> getStat();
}
