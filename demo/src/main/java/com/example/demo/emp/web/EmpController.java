package com.example.demo.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.emp.EmpVO;
import com.example.demo.emp.mapper.EmpMapper;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Controller // 컨테이너 빈 등록 + 사용자 요청처리 커맨드 핸들러로 변환
public class EmpController {

//	@Setter(onMethod_ = @Autowired) // lombok setter 생성 기능. setter전체를 autowired 
//	@Autowired, // 의존성 주입(DI Dependency Injection)
	final EmpMapper mapper;

	@RequestMapping("/update")
	@ResponseBody
	public String update(List<String[]> hobby) {
		System.out.println(hobby);
		return "true";
	}

	@RequestMapping("/ajaxEmp") // 데이터 요청 보낼 파라미터 주소 지정
	@ResponseBody // 응답으로 보낼 부분
	public List<EmpVO> ajaxEmp() {
		return mapper.getEmpList(null, null);
	}

	@RequestMapping("/empResult")
	public String result() {
		return "empList";
	}

	@PostMapping("/insert3")
	public String insert3(EmpVO vo, RedirectAttributes rttr) {
		System.out.println("등록: " + vo);
		rttr.addAttribute("insertResult", "성공");
		rttr.addFlashAttribute("flashResult", "한번만 사용가능");
		return "redirect:empResult";
	}

	@PostMapping("/insert2")
	public ResponseEntity<EmpVO> insert2(EmpVO vo) {
		return new ResponseEntity<>(vo, HttpStatus.OK);
	}

	@RequestMapping("/insert")
	public String insert(@ModelAttribute("emp") EmpVO vo) {
		System.out.println(vo);
//		mapper.insertEmp(vo);
		// 커맨드객체는 model에 추가

		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("insertResult", "success");

//		model.addAttribute("insertResult","success");
		return "result";
	}

	@GetMapping("/")
	public String test() {
		return "index";
	}

	@RequestMapping("/empList")
	public String empList(Model model) { // Model :
		model.addAttribute("empList", mapper.getEmpList(null, null)); // DB 쿼리문 실행
		return "empList";
	}
}
