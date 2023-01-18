package ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@GetMapping("loginajax")
	public String loginajax() {
		return "ajax/loginform";
	}
	@ResponseBody
	@PostMapping(value="/loginajax",produces = {"application/json;charset=utf-8"})
	public String loginajax2(String id, String pw) {
		String result = null;
		if(id.equals("ajax") && pw.equals("1234")){
			result = "login성공";
		}else {
			result = "login실패";
		}
		return "{ \"process\" : \"" + result + "\" }";//형식은 json이지만 자바입장에선 String이다,변수이름이 process
		//return result; 서버자체에이상은없지만 client가받을때 json형태아니라 못받는다
		
	}
}
