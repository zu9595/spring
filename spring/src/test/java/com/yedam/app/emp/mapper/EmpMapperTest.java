package com.yedam.app.emp.mapper;

import org.apache.ibatis.annotations.Select;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/class")
public class EmpMapperTest {
	
	@Select("select sysdate from dual")
	public void getTime() {
	}
}
