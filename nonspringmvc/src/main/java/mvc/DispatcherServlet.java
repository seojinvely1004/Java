package mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class DispatcherServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI(); //   /nonspringmvc/a/b/c/hello
		String uri_array[] = uri.split("/");
		String result = uri_array[uri_array.length -1]; // hello
		//System.out.println(result);//url가장마지막요소분리출력
		//url - controller매핑
		//hello > HelloController객체 > HelloDTO (모델) > hello.jsp (뷰)
		//list > ListController > ArrayList<HelloDTO> > list.jsp
		HandlerMapping mappings = new HandlerMapping();
		Controller controller = mappings.getController(result);
		String viewname = controller.handleRequest(request, response);
		//포워드
		RequestDispatcher rd = request.getRequestDispatcher(viewname);
		rd.forward(request, response);
	}

}
