package chap4;

public class SwitchCaseTest {

	public static void main(String[] args) {
		//String condition = "제목";
		String condition = "조회수";
		switch(condition) {
		case"제목" : 
			System.out.println("제목으로 검색합니다.");
			break; 
		case"내용" : 
			System.out.println("내용으로 검색합니다.");
			break; 
		case"작성자" : 
			System.out.println("작성자로 검색합니다.");
			break; 
		default:
			System.out.println("검색 불가합니다.");
		}
		
		/*if(condition == "제목") {
			System.out.println("제목으로 검색합니다.");
		}else if(condition == "작성자") {
			System.out.println("작성자로 검색합니다.");
		}else if(condition == "내용") {
			System.out.println("내용으로 검색합니다.");
		}else {
			System.out.println("검색 불가합니다.");
		}*/
		

	}

}
