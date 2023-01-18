package upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DownloadController {
	@RequestMapping("/filelist")//다운로드 한 파일 목록 출력 
	public ModelAndView downloadlist() {
		ModelAndView mv = new ModelAndView();
		
		File f = new File("c:/upload");
		String filelist[] = f.list();
		
		mv.addObject("filelist",filelist);
		mv.setViewName("upload/filelist");
		return mv;
	}
	@RequestMapping("/filedownload")//사용자가 파일 이름 목록 클릭시 다운로드가능하도록 url
	public void filedownload(String onefile,HttpServletResponse response) throws IOException {
		//
		File f = new File("c:/upload/"+onefile);
		int f_length = (int)f.length();//byte단위
		
		//응답할 컨텐츠 다운로드 파일
		response.setContentType("application/download");
		response.setContentLength(f_length);
		response.setHeader("Content-Disposition" , "attachment;filename=\"" + onefile + "\"");
			
		//서버:출력, 클라이언트:입력받
		OutputStream out = response.getOutputStream();
		FileInputStream f_in=new FileInputStream(f);
		FileCopyUtils.copy(f_in, out);//실제 다운로드가 일어나는 곳
		f_in.close();
		out.close();
	}
}
