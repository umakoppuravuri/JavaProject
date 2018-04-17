import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		int n,i;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		for(i=1;i<=10;i++){
			System.out.println(n +"*"+i+"="+(n*i));
		}
	}

}
