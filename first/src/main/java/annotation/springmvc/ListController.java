package annotation.springmvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListController  {

	@RequestMapping("/list")
	public ModelAndView b() throws Exception {
		ArrayList<String> list = new ArrayList();
		list.add("홍길동");
		list.add("김길동");
		list.add("이길동");
		list.add("최길동");
		list.add("나길동");

		ModelAndView mv = new ModelAndView();
		//request.setAttribute("model", dto);
		mv.addObject("memberlist", list);
		mv.setViewName("list");
		return mv;
	}


}
