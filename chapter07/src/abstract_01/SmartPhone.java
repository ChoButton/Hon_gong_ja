package abstract_01;

public class SmartPhone extends Phone{
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드
	public void internerSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
