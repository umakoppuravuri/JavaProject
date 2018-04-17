package System.out;

class X{}
class Emp{}
class Y{}
class Student{}

class TestMethod1 {
	void m1(X x,Emp e){
		System.out.println("Method m1");
	}
   static void m2(Y y, Student s){
	   System.out.println("Method m2");
    }
	public static void main(String[] args) {
		TestMethod1 t = new  TestMethod1();
		X x= new X();
		Emp e1 = new Emp();
		
		t.m1(x, e1);
		//or
		t.m1(new X(), new Emp());
		
		/*Y y = new Y();
		Student s1 = new Student();
		TestMethod1.m2(y, s1);*/
		TestMethod1.m2(new Y(),new Student());

	}

}
