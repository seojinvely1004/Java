package annotation.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//  1> 필요하지 않는 매개변수 선언 
//  2> 리턴타입 고정
//  3> 1개 URL 처리 
//   context:component-scan
@Controller
public class HelloController  {
	@RequestMapping("/hello")
	public ModelAndView a() {
		//uri
		HelloDTO dto = new HelloDTO();
		dto.setMessage("컨트롤러가 view로 전달하는 모델입니다.");
		ModelAndView mv = new ModelAndView();
		mv.addObject("model", dto);
		//request.setAttribute(null, dto);
		mv.setViewName("hello");
		return mv;
	}

	@RequestMapping("/hello2")
	public String b()  { //매핑메소드리턴타입 String--model없고 -jsp이름
		return "hello";//  WEB-INF/views/?.jsp

	}
	
	@RequestMapping("/hello3")
	public void c()  { //매핑메소드리턴타입 String--model없고 -jsp이름 자동 url 동일.hello3.jsp
		
	}
	@RequestMapping("/hello4")
	public String d(Model m)  { //매핑메소드리턴타입 String--model없고 -jsp이름 자동 url 동일.hello3.jsp
		HelloDTO dto = new HelloDTO();
		dto.setMessage("컨트롤러가 view로 전달하는 모델입니다.");
		m.addAttribute("model", dto);
		return "hello";
	}
}
