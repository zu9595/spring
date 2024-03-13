package com.example.demo.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.emp.EmpVO;
import com.example.demo.emp.mapper.EmpMapper;

@Controller
public class EmpController {
	@Autowired // 의존성 주입(DI Dependency Injection)
	EmpMapper dao;

	@RequestMapping("/ajaxEmp") // 데이터 요청 보낼 파라미터 주소 지정
	@ResponseBody // 응답으로 보낼 부분
	public List<EmpVO> ajaxEmp() {
		return dao.getEmpList();
	}

	@RequestMapping("/empList")
	public String empList(Model model) { // Model :
		model.addAttribute("empList", dao.getEmpList()); // DB 쿼리문 실행
		return "empList";
	}
}
