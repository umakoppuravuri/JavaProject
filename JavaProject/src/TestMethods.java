
public class TestMethods {

	public void m1(int a , char c){   //instance Method  or non static method
		System.out.println("Method m1");
		System.out.println(a);
		System.out.println(c);
	}
	static void m2(String s, double d){//Static method
		System.out.println("Method m2");
		System.out.println(s);
		System.out.println(d);
		
	}
	public static void main(String[] args) {
		TestMethods t = new TestMethods();
		t.m1(10,'a');
		TestMethods.m2("uma",10.5);
	}

}
