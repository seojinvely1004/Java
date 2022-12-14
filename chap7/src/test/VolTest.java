package test;
class TV implements Volume{
	int VolLevel;
	TV(int vol){
		this.VolLevel = vol;
		System.out.println("현재 TV의 볼륨 = " + VolLevel);
	}
	@Override
	public void volumeUp(int vol) {
		VolLevel += vol;
		System.out.println("현재 TV의 볼륨 = " + VolLevel);
	
	}
	@Override
	public void volumeDown(int vol) {
		VolLevel -= vol;
		if(VolLevel < 0) {
			VolLevel = 0;//최소값0이므로 음수시 0으로 설정
		}
		System.out.println("현재 TV의 볼륨 = " + VolLevel);
		
	}
}

class Speaker implements Volume{
	int VolLevel;//기본최솟값0인데, -100으로 시작하고싶다 > 아래처럼 초기화
	Speaker(int vol){
		this.VolLevel = vol;
		System.out.println("현재 speaker의 볼륨 = " + VolLevel);
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
}
class Radio implements Volume{
	int VolLevel;
	Radio(int vol){
		this.VolLevel = vol;	
		System.out.println("현재 radio의 볼륨 = " + VolLevel);
	}
	@Override
	public void volumeUp(int vol) {	
		VolLevel += vol;
		System.out.println("현재 radio의 볼륨 = " + VolLevel);
	}
	@Override
	public void volumeDown(int vol) {
		VolLevel -= vol;
		System.out.println("현재 radio의 볼륨 = " + VolLevel);
	
	}
}
public class VolTest {
	public static void main(String[] args) {
		Volume v[ ] = new Volume[3];//서로다른 클래스(3개)에 관계를 맺어준다.배열로.
		v[0] = new Speaker(20);
		v[1] = new TV(50);
		v[2] = new Radio(100);
		for(int i = 0; i < v.length; i++){
		 v[i].volumeUp(200);
		 v[i].volumeDown(300);
		}
	}
}


