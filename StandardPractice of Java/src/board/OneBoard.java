package board;

class OneBoard {//�Խù� 1�� ���� ���� ��ü
	private int seq;//�Խù� ��ȣ
	private String title;//�Խù� ����
	private String contents;//�Խù� ����
	private String writer;//�ۼ���
	private int viewcount;//��ȸ��
	//������ private�� ������ ��, getter setter�޼���� public���� �����Ͽ� ����� ��.
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
	
	//setter(����, ����) getter(��ȸ)
	/*public void setSeq(int seq) {
		//this.seq = seq+10;//���� ��� �ܺο� ���µǾ����� �����Ƿ� �޼��带 ��η� �Ͽ� �����Ӱ� ����� �� �ִ�. 
		this.seq = seq;
	}
	public int getSeq() {
		return seq*10;
	}*/
	
}
