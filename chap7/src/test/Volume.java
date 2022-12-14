package test;

public interface Volume {

	void volumeUp(int vol);

	void volumeDown(int vol);
	//디폴드/스테틱 메서드 위해 추가하기 (jdk1.8이후추가)
	static void print1(String name) {
		System.out.println(name + "클래스가 볼륨업 수행중입니다");
	}
	static void print2(String name) {
		System.out.println(name + "클래스가 볼륨다운 수행중입니다");
	}
	

}
