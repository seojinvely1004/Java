package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller{//model과 view를만들어주는역할

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		//추가파라미터 request통해 읽어들어옴
		HelloDTO dto = new HelloDTO();
		dto.setMessage("컨트롤러가 view로 전달하는 모델입니다.");//jsp view를통해 보여줄 것임
		request.setAttribute("model", dto);//request로 넣어놔야 jsp로 포워드되면서가져간다
		//view 설정
		return "hello.jsp";//${model.message}
	}

}
