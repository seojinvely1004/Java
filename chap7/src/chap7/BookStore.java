package chap7;

public class BookStore {

	public static void main(String[] args) {
		Book booklist[] = new Book[5];

		Book book1 = new Book("Java Program", 25000);
		Book book2 = new Book("JSP Program", 15000);
		Book book3 = new Book("SQL Fundamentals", 30000);
		Book book4 = new Book("JDBC Program", 28000);
		Book book5 = new Book();
		book5.setTitle("EJB Program");
		book5.setPrice(34000);
		booklist[0] = book1;
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;
		
		BookMgr mgr = new BookMgr(booklist);
		System.out.println("=== 책 목록 ===");
		mgr.printBookList();
		System.out.println("");
		System.out.println("=== 책 가격의 총합 ===");
		mgr.printTotalPrice();
	}
}
class Book{
	private String title;
	private int price;//private접근제한자를 가지는 멤버변수2개
	Book(String title, int price){//멤버변수를 모두 초기화하는 생성자
		this.price = price;
		this.title = title;
	}
	Book(){ }
		public void setTitle(String title){//멤버변수에 값을 설정하고 리턴하는 setter/getter 메서드
			this.title = title;
		}
		String getTitle() {
			return title;
		}
		void setPrice(int price) {
			
		}
		int getPrice() {
			return price;
	}
}
class BookMgr{
	Book booklist [];//책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로
	BookMgr(Book [] booklist){//책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드
		this.booklist = booklist;
	}
	void printBookList() {//책 목록을 화면에 출력하는 printBookList() 메서드
		for(int i = 0; i < booklist.length; i++) {
			Book b  = booklist[i];
			System.out.println(b.getTitle() + " : " + b.getPrice());
		}	
	}
	void printTotalPrice() {//모든 책 가격의 합을 출력하는 printTotalPrice() 메서드
		int totalPrice = 0; //지역변수 명시적 초기화 필요
		for(int i = 0; i < booklist.length; i++) {
			//totalPrice = totalPrice + booklist[i].getPrice();
			totalPrice += booklist[i].getPrice();
			
		}
		System.out.println("전체 가겨의 책 합 : " + totalPrice);
	}
}


