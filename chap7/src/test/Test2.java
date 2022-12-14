package test;

class Information{
	String id;
	String name;
	Information(String id, String name){
		this.id = id;
		this.name = name;
	}
	String print() {
		return id+":"+name;
	}
}
class Product extends Information{
	
}
class Board extends Information{
	
}
class Member extends Information{
	
}
class InformationList{
	Information array [];
	int length;//멤버변수
	int count;//배열 인덱스 증가 담기 위한 변수
	InformationList(String length){//생성자 명령행 매개변수/main으로부터 전달받아 입력받은 수만큼 배열length로 하여 배열객체생성
		this.length = Integer.parseInt(length);
		array = new Information(this.length);
	}
	void add(Information inform) {//6번
		if(count > length) {
			return;//add메서드 종료 (6번)
		}
		array[count++] = inform;
		
	}
	
}
public class Test2 {
	public static void main(String[] args) {
		InformationList list = new InformationList(args[0]);//
		list.add(new Board("1","게시물1","현재 조회수 10입니다", 
				10));
		list.add(new Product("100", "웅진비데", 300000));
		list.add(new Member("hong","홍길동","hong@a.com","010-222-
				2222"));
				list.add(new Board("2","게시물2","새로운 게시물 추가합니다
						", 0));
						list.add(new Product("200", "웅진정수기", 1000000));
				list.add(new Member("lee","이철수","chul@b.com","010-333-
						3333"));
						list.read();
	}
}