package board.spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	@Autowired
	BoardService service;
	
	@RequestMapping("/boardlist")
	public ModelAndView boardlist(int page) {
		//1. select count(*) from board -> board table에서 int로받아 model저장
		//2. select * from board limit (page-1)*3,3 ->3페이지씩 가져온다 ->list>model저장
		//3.board폴더/list.jsp :뷰
		int totalboard = service.getTotalBoard();
		
		int limit = (page-1)*3;
		List<BoardDTO> list = service.getBoardList(limit);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("totalboard",totalboard);
		mv.addObject("list",list);
		mv.setViewName("board/list");
		return mv;	
	}
}
