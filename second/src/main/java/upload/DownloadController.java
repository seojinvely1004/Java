package upload;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import jakarta.servlet.http.HttpServletResponse;
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
	
	
	@RequestMapping("/filedownload")
	public void filedownload(String onefile, HttpServletResponse response) throws IOException {
		System.out.println(onefile);
		// onefile이라는 파일의 이름을 c:upload에서 찾는다
		File f = new File("c:/upload/" + onefile);
		int f_length = (int)f.length(); //byte단위 - long타입이여서 int로 형변환
		
		// 응답할 컨텐츠 다운로드
		response.setContentType("application/download");
		response.setContentLength(f_length);
		response.setHeader("Content-Disposition","attachment;filename=\""+ onefile+ "\"");
//		response.setHeader("Content-Disposition" , "attachment;filename=\"" + onefile + "\"");
		//클라이언트 입력 - 서버 출력 
		OutputStream out = response.getOutputStream();
		FileInputStream f_in = new FileInputStream(f); // 파일 찾기
		FileCopyUtils.copy(f_in, out); // 다운로드 
		f_in.close();
		out.close();
		
	}
	
}