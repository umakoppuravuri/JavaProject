
public class equalsmethod {

	public static void main(String[] args) 
	{
		//In general we use == operator for reference comparison, where as .equals() method for content comparison
		String s1 = new String("Uma");
		String s2 = new String("Uma");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		

	}

}
