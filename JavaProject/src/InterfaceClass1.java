
public class InterfaceClass1 implements It2.It3 {

	public void m1(){
		System.out.println("M1 Method");
	}
	public static void main(String[] args) {
		new InterfaceClass1().m1();
		InterfaceClass1 test = new InterfaceClass1();
		test.m1();
		
		
	}
	

	
}
