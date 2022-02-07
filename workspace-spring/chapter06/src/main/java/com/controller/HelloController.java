package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
						
	/*				//value는 빼도 됨
//	@RequestMapping(value="/hello.do", method=RequestMethod.GET)
	@GetMapping("/hello.do")
	public ModelAndView hello() { // 사용자가 만든 콜백 메소드
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", "Have a nice day!!");
//		mav.setViewName("hello"); // =>/view/hello.jsp
		mav.setViewName("/view/hello");
		return mav;
	}*/
	
	@GetMapping(value="/hello.do", produces="text/html; charset=UTF-8")
	//리턴 타입이 String 이면 단순 문자열로 인식하는 것이 아니라 파일명으로 인식한다.
	//@ReseponseBody 를 사용하면 단순 문자열로 인식해라
	public @ResponseBody String hello() {
		return "안녕하세요!!"; //브라우저에 그냥 뿌린다.
	}
	
	
}
