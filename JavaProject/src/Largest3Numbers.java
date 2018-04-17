import java.util.Scanner;

public class Largest3Numbers {

	public static void main(String[] args) {
		int x,y,z;
		Scanner in = new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		if(x>y && x>z)
			System.out.println( "x Is greater than y,z");
		else if(y>x && y>z)
			System.out.println( "y Is greater than x,z");
		else
			System.out.println( "z Is greater than x,y");
	}

}
