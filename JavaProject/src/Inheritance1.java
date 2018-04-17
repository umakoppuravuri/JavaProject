
public class Inheritance1 extends Inheritance 
{
	
	public void m3(){
		System.out.println("3 method");
	}
	
	public void m6(){
		System.out.println("6 Method");
	}
	public static void main(String args[]){
		Inheritance p = new Inheritance();
		p.m1();
		p.m2();
		Inheritance1 p1 = new Inheritance1();
		p1.m3();
		p1.m6();
	}
	

}
