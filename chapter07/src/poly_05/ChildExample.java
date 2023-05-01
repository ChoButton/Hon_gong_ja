package poly_05;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "date1";
		parent.merhod1();
		parent.method2();
		/*
		 parent.filed2 = "data2";
		 parent.method3();
		 */
		
		Child child = (Child)parent;
		child.field2 = "yyy";
		child.method3();
	}

}
