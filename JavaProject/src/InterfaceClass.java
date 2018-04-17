
public class InterfaceClass implements It1{

	public void m1(){
		System.out.println("M1 Method");
	}
	public void m2(){
		System.out.println("M2 Method");
	}
	public void m3(){
		System.out.println("M3 Method");
	}
	public static void main(String[] args) {
		InterfaceClass test = new InterfaceClass();
		test.m1();
		test.m2();
		test.m3();
		
		It1 t = new InterfaceClass();
		t.m1();
		t.m2();
		t.m3();
	}

}
