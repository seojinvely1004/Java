package board;

class OneBoard {//게시물 1개 정보 저장 객체
	private int seq;//게시물 번호
	private String title;//게시물 제목
	private String contents;//게시물 내용
	private String writer;//작성자
	private int viewcount;//조회수
	//변수는 private로 지정할 것, getter setter메서드는 public으로 지정하여 사용할 것.
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	
	//setter(저장, 수정) getter(조회)
	/*public void setSeq(int seq) {
		//this.seq = seq+10;//구현 방법 외부에 오픈되어있지 않으므로 메서드를 통로로 하여 자유롭게 사용할 수 있다. 
		this.seq = seq;
	}
	public int getSeq() {
		return seq*10;
	}*/
	
}
