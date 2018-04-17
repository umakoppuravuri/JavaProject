
public class TestMethod2 {
	
	int x=1000;
	int y= 2000;
	void add(int a ,int b){
		System.out.println(a+b);
		System.out.println(x+y);
	}
	void m1(){
		m2();//instance method calling
		System.out.println("Method m1");
	}
	void m2(){
		m3(10);
		System.out.println("Method m2");
	}
	void m3(int a){
		System.out.println("Method m3");
	}
	public static void main(String[] args) {
		TestMethod2 t = new  TestMethod2();
		t.m1();
		t.add(100,200);
	}

}
