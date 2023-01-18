package upload;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DownloadController {
	@RequestMapping("/filelist")
	public ModelAndView downloadlist() {
		ModelAndView mv = new ModelAndView();
		
		File f = new File("c:/upload");
		String filelist[] = f.list();
		
		mv.addObject("filelist",filelist);
		mv.setViewName("upload/filelist");
		
		return mv;
	}
}
