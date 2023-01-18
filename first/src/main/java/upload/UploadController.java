package upload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UploadController {
	// uploadform 보여주는 메소드
	
	@GetMapping("/fileupload")
	public String uploadform() {
		return "upload/uploadform";
	}
	// 파일 선택 받아서 업로드 처리하는 메소드
	
	
}
