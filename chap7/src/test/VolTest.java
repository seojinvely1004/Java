package test;
class TV implements Volume{
	@Override
	public void volumeUp(int vol) {
	
	}
	@Override
	public void volumeDown(int vol) {
		
	}
	void TV() {
		
	}
}

class Speaker implements Volume{
	int VolLevel;//기본최솟값0인데, -100으로 시작하고싶다 > 아래처럼 초기화
	Speaker(int vol){
		this.VolLevel = vol;
	}
	//-100~100사이 볼륨 조절 하도록
	@Override
	public void volumeUp(int vol) {
		VolLevel += vol;
		if(VolLevel > 100) {
			VolLevel = 100;//최대값100
		}
		System.out.println("현재 speaker의 볼륨 = " + VolLevel);
	}
	@Override
	public void volumeDown(int vol) {
		VolLevel -= vol;
		if(VolLevel < -100) {
			VolLevel = -100;//최소값-100
		}
		System.out.println("현재 speaker의 볼륨 = " + VolLevel);
	}
	void Speaker() {
		
	}
}
class Radio implements Volume{
	@Override
	public void volumeUp(int vol) {	
	}
	@Override
	public void volumeDown(int vol) {	
	
	}
	void Radio() {
		System.out.println("rr");
	}
}
public class VolTest {
	public static void main(String[] args) {
		Volume v[ ] = new Volume[3];
		v[0] = new Speaker();
		v[1] = new TV();
		v[2] = new Radio();
		for(int i = 0; i < v.length; i++){
		 v[i].volumeUp(200);
		 v[i].volumeDown(300);
		}
	}
}


