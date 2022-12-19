package test;

public interface Volume {

	void volumeUp(int vol);

	void volumeDown(int vol);
	//스테틱 메서드 위해 추가하기 (jdk1.8이후추가)
	static void print1(String name) {
		System.out.println(name + "클래스가 볼륨업 수행중입니다");
	}
	static void print2(String name) {
		System.out.println(name + "클래스가 볼륨다운 수행중입니다");
	}
	//디펄트 메서드 추가해보기 (jdk1.8이후추가)
	default void print3() {
		System.out.println("뒤늦게 메서드를 추가하겠습니다. 자식클래스 오버라이딩은 선택사항입니다.");
	}
	

}
