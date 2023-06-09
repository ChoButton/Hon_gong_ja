package singleton;

public class SingletonExample {

	public static void main(String[] args) {
		/*
		 Singleton obj1 = new Singleton();
		 Singleton obj2 = new Singleton();
		 */
		
		Singleton obj1 = Singleton.gerInstance();
		Singleton obj2 = Singleton.gerInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 싱글톤 객체입니다.");
		}else {
			System.out.println("다른 싱글톤 객체입니다.");
		}
		
	}

}
