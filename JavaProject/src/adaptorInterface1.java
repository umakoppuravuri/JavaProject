
public class adaptorInterface1 extends AdaptorInterface {

	public void m1(){
		System.out.println("M1 Method");
	}
	public void m5(){
		System.out.println("M5 Method");
	}
	public static void main(String args[]){
		new adaptorInterface1().m1();
		new adaptorInterface1().m5();

		
	}
}
