package ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	@GetMapping("loginajax")
	public String loginajax() {
		return "ajax/loginform";
	}
	@PostMapping("loginajax")
	public String loginajax2(String id, String pw) {
		return "ajax/loginprocess";
	}
}
