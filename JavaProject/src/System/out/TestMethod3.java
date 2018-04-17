package System.out;

public class TestMethod3 {

	int x=100;
	int y= 200;
	void add(int x ,int y){
		System.out.println(x+y);
		System.out.println(this.x+this.y);
	}
	public static void main(String[] args) {
		TestMethod3 t = new  TestMethod3();
		t.add(1000,2000);
	}

}
