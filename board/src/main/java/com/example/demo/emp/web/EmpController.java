package com.example.demo.emp.web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.emp.EmpVO;
import com.example.demo.emp.SearchVO;
import com.example.demo.emp.mapper.EmpMapper;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Controller // 컨테이너 빈 등록 + 사용자 요청처리 커맨드 핸들러로 변환
public class EmpController {

//	@Setter(onMethod_ = @Autowired) // lombok setter 생성 기능. setter전체를 autowired 
//	@Autowired // 의존성 주입(DI Dependency Injection)
	final EmpMapper mapper;

	@GetMapping("/emp/insert")
	public void insert() {
		
	}

	// 등록처리 --> employees 테이블에 photo 컬럼 추가
	@PostMapping("/insert")
	public String insert(EmpVO vo, MultipartFile photoFile) throws IllegalStateException, IOException {
		if(photoFile != null && photoFile.getSize() > 0 ) {
			vo.setPhoto(photoFile.getOriginalFilename());
			photoFile.transferTo(new File("d:/upload", photoFile.getOriginalFilename()));
		}
		mapper.insertEmp(vo);
		System.out.println("등록: " + vo);
		return "redirect:/emp/list";
	}

	// 수정페이지 이동
	@GetMapping("/emp/update/{eId}")
	public String update(Model model, @PathVariable int eId) {
		model.addAttribute("upInfo", mapper.getEmpInfo(eId));
		return "emp/update";
	}

	// 수정처리
	@PutMapping("/update")
	public String update(EmpVO vo, MultipartFile photoFile) throws IllegalStateException, IOException {
		if(photoFile != null && photoFile.getSize() > 0 ) {
			vo.setPhoto(photoFile.getOriginalFilename());
			photoFile.transferTo(new File("d:/upload", photoFile.getOriginalFilename()));
		}
//		mapper.updateEmp(vo);
		System.out.println("수정: " + vo);
		return "redirect:/emp/list";
	}
	
	// 삭제처리
	@GetMapping("/emp/delete/{eId}")
	public String delete(@PathVariable int eId) {
		mapper.deleteEmp(eId);
		return "redirect:/emp/list";
	};
	// 상세조회 페이지 이동
	@GetMapping("/emp/info/{eId}")
	public String info(Model model, @PathVariable int eId) {
		model.addAttribute("empInfo", mapper.getEmpInfo(eId));
		return "emp/info";
	}
	// 목록페이지로 이동
	@RequestMapping("/emp/list")
	public String empList(Model model, EmpVO vo, SearchVO svo) {
		model.addAttribute("empList", mapper.getEmpList(vo, svo));
		return "emp/list";
	}
}
