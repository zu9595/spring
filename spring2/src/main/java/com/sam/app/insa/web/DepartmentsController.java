package com.sam.app.insa.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sam.app.insa.service.DepartmentsService;
import com.sam.app.insa.service.DepartmentsVO;

@RequestMapping("/insa")
@Controller
public class DepartmentsController {
	
	@Autowired
	DepartmentsService deptService;
	
	@GetMapping("/")
	public String deptList(Model model) {
			model.addAttribute("deptList", deptService.getDeptList());
		return "insa/departmentslist";
	}
}
