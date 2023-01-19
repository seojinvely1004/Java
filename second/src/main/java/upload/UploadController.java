package upload;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class UploadController {
	// uploadform 보여주는 메소드	
	@GetMapping("/fileupload")
	public String uploadform() {
		return "upload/uploadform";
	}
	// 파일 선택 받아서 업로드 처리하는 메소드
	@PostMapping("/fileupload")
	public String uploadprocess(@ModelAttribute("dto") UploadDTO dto) throws IOException {
		//c:/upload 폴더에 업로드했던 이름 그대로 저장
		//저장(uplooadDTO에)한 결과 객체를 그대로 view에 전달할 수 있도록 한다 uploadprocess.jsp
		
		String savePath = "c:/upload/";
		MultipartFile mf1 = dto.getFile1();
		String filename1 = mf1.getOriginalFilename();////파일명 추출/사용자가보낸 2개 중 1번째파일명
		//파일이름.확장자 분리 
		String beforeext1 = filename1.substring(0,filename1.lastIndexOf('.'));
		String ext1 = filename1.substring(filename1.lastIndexOf('.'));
			//UUID.randomUUID()
		String newfilename1 = beforeext1 + "(" + UUID.randomUUID().toString()+")"+ext1;
		File serverfile1 = new 	File(savePath + newfilename1);//사용자가 보냈던 추출한 파일명을 그대로 저장 (서버내부에서도 클라이언트가 보낸 파일명 그대로 해야함)
		mf1.transferTo(serverfile1);//multipart의 mf1내용을 뽑아서 위에서지정해준경로로 위치 지정
		
		MultipartFile mf2 = dto.getFile2();
		String filename2 = mf2.getOriginalFilename();
		String beforeext2 = filename2.substring(0,filename2.lastIndexOf('.'));
		String ext2 = filename2.substring(filename2.lastIndexOf('.'));
			//UUID.randomUUID()
		String newfilename2 = beforeext2 + "(" + UUID.randomUUID().toString()+")"+ext2;
		File serverfile2 = new 	File(savePath + newfilename2);
		mf2.transferTo(serverfile2);
		return "upload/uploadprocess";
	}
}
