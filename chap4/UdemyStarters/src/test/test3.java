package test;

public class test3 {

	public static void main(String[] args) {
		int books = 100;//도서의 수
		int cntOfStu = 12;//학생수
		//12명의 학생에게 xx권씩을 나누어줍니다. 
		//남은 책은 xx권입니다.
		int quotienBook = books/cntOfStu;
		int remainder = books%cntOfStu;
		
		/*System.out.println(cntOfStu +"명의 학생에게 " + quotienBook + "권을 나누어줍니다.\n "
				+ "남은 책은" + remainder + "권 입니다.");*/
		System.out.printf("%d명의 학생에게 %d권씩 나누어 줍니다. 남은 책은 %d권 입니다 ", cntOfStu, quotienBook, remainder);

	}

}
