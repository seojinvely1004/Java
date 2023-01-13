package annotation.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	@Autowired
	@Qualifier("service2")
	MemberService service; //MemberBasicService 객체
	
	@GetMapping("/register")
	String insertMember(){
		return "member/register";//member/register.jsp(7개 데이터폼)
	}
	@PostMapping("/register")
	ModelAndView insertMember2(@ModelAttribute("dto") MemberDTO dto) {
		/*1. dto 입력 id와 pw spring/1111 인지 검사
		 * 2-1. 맞으면 이전 가입된 적이 있습니다. spring 회원님은 정상로그인되셨습니다. 모델로 생성
		 * 2-2. 아니면 dto 모든 변수값 출력. 회원가입되셨습니다. 모델로 생성
		 * 3. 
		 *  */
		String result = service.registerMember(dto);
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", result);
		//mv.addObject("dto", dto);
		mv.setViewName("member/registersuccess");
		return mv;
	}
}
