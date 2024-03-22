package com.sam.app.insa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sam.app.insa.service.DepartmentsVO;

@Mapper
public interface DepartmentsMapper {
	List<DepartmentsVO> getDeptList();
}
