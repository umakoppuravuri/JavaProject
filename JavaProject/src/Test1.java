
public class Test1 {
	
	public void test(){
		System.out.println("Non Static Method");
	}
	final static void test2(){
		System.out.println("Static Method ");
		
	}
	
public static void main(String args[])
{
	//first method object creation
	//Test1.test();
	Test1 obj = new Test1();
	obj.test();
	
	//second method is static method no need to create object
	Test1.test2();
	
	System.out.println("welcome java project");
}
}
