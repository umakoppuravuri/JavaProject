import java.util.Scanner;

public class CompareStrings {
	
public static void main(String args[]){
	
	String s1,s2;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter First String ");
	s1=in.nextLine();
	
	System.out.println("Enter second String ");
	s2=in.nextLine();
	if(s1.compareTo(s2)>0)
		System.out.println("First String greater than second");
	else if(s1.compareTo(s2)<0)
		System.out.println("First String smaller than second");
	else
		System.out.println("Both String are equal");
	}
}