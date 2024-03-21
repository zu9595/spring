package com.yedam.app.emp.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*-context.xml")
public class EmpServiceTest {
	@Autowired EmpService empService;
	
	@Test
	public void logtest() {
		empService.getTime();
	}
	
	@Test
	public void getInfotest() {
		empService.getInfo("100");
	}
}
