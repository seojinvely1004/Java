package board;

class OneBoard {//�Խù� 1�� ���� ���� ��ü
	private int seq;//�Խù� ��ȣ
	private String title;//�Խù� ����
	private String contents;//�Խù� ����
	private String writer;//�ۼ���
	private int viewcount;//��ȸ��
	
	//setter(����, ����) getter(��ȸ)
	public void setSeq(int seq) {
		//this.seq = seq+10;//���� ��� �ܺο� ���µǾ����� �����Ƿ� �޼��带 ��η� �Ͽ� �����Ӱ� ����� �� �ִ�. 
		this.seq = seq;
	}
	public int getSeq() {
		return seq*10;
	}
}
