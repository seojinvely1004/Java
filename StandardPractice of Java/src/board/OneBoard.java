package board;

class OneBoard {//게시물 1개 정보 저장 객체
	private int seq;//게시물 번호
	private String title;//게시물 제목
	private String contents;//게시물 내용
	private String writer;//작성자
	private int viewcount;//조회수
	
	//setter(저장, 수정) getter(조회)
	public void setSeq(int seq) {
		//this.seq = seq+10;//구현 방법 외부에 오픈되어있지 않으므로 메서드를 통로로 하여 자유롭게 사용할 수 있다. 
		this.seq = seq;
	}
	public int getSeq() {
		return seq*10;
	}
}
