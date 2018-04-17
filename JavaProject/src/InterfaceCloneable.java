// Cloneable is Marker interface(  Markar interface contain 0 Methods)
public class InterfaceCloneable implements Cloneable {
	int a =10;
	int b= 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		InterfaceCloneable t = new InterfaceCloneable();
		System.out.println(t.a);
		System.out.println(t.b);
		t.a=666;
		t.b=777;
		System.out.println(t.a);
		System.out.println(t.b);
		InterfaceCloneable t1 = (InterfaceCloneable)t.clone();
		
		t.a=888;
		t.b=999;
		System.out.println(t.a);
		System.out.println(t.b);
		
		System.out.println(t1.a);
		System.out.println(t1.b);

	}

}
