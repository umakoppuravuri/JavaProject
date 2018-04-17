
public class AbstractClass1 extends AbstractClass{

	public AbstractClass1(int empNo,String name){
		super(empNo,name);//super class constructor
	}
	public static void main(String args[]){
	AbstractClass1 obj = new AbstractClass1(101,"uma");
	System.out.println(obj);
}
}