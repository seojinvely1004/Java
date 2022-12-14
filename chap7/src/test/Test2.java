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
class Board extends Information{//Board() {super();} 
	//String id, name은 상속받아 사용
	String contents;
	int viewcount;//조회수
	//(new Board("1","게시물1","현재 조회수 10입니다", 10))
	Board(String id, String name, String contents, int viewcount){
		super(id, name);//Information(String id, String name)
		this.contents = contents;
		this.viewcount = viewcount;
	}
	
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
	void add(Information inform) {//6번,﻿main으로부터 전달받은 각 객체들을 멤버변수 배열에 저장
		if(count > length) {
			return;//add메서드 종료 (6번)
		}
		array[count++] = inform;
	}
	void read() {//﻿ 배열 내의 각 객체 정보를 출력
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
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