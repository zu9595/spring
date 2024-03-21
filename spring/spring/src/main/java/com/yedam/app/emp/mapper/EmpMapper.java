package com.yedam.app.emp.mapper;

import org.apache.ibatis.annotations.Select;

public interface EmpMapper {
	@Select("select sysdate from dual")
	public String getTime();
}
