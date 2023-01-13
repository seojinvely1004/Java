package annotation.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	//@RequestMapping("/loginform")
	//@RequestMapping(value="/login", method= RequestMethod.GET)
	// 3.x
	
	@GetMapping("login") //4.3
	public String loginform() {
		return "loginform";
	}
	
	//@RequestMapping(value="/login", method=RequestMethod.POST)
	/*@PostMapping("login")
	public ModelAndView loginprocess(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		// db 로그인정상 확인
		LoginDTO dto=new LoginDTO();
		dto.setId(id);
		dto.setPw(pw);
		ModelAndView mv = new ModelAndView();
		mv.addObject("loginresult", dto);
		mv.setViewName("loginsuccess");
		return mv;
	}*/
	
/*	@PostMapping("login")
	public ModelAndView loginprocess(
	@RequestParam(value="id2", required=false, defaultValue="아이디") String id, int pw) {
		//String id = request.getParameter("id2");
		//String pw = request.getParameter("pw");
		// db 로그인정상 확인
		LoginDTO dto=new LoginDTO();
		dto.setId(id);
		dto.setPw(String.valueOf(pw));
		ModelAndView mv = new ModelAndView();
		mv.addObject("loginresult", dto);
		mv.setViewName("loginsuccess");
		return mv;
	}
*/	

/*	@PostMapping("login")
	public ModelAndView loginprocess(LoginDTO dto, int age) {  //--dto.setId(request.getParameter("id"))
		// db 로그인정상 확인
		System.out.println(age);
		ModelAndView mv = new ModelAndView();
		mv.addObject("loginresult", dto);
		mv.setViewName("loginsuccess");
		return mv;
	}*/
	
	@PostMapping("login")
	public String loginprocess(@ModelAttribute("loginresult") LoginDTO dto) {  
		return "loginsuccess";
	}
	@ModelAttribute("all")
	public String all() {
		return "모든 뷰에서 사용 가능합니다.";
	}
	
	
}
