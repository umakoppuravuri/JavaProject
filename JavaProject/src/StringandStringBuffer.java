
public class StringandStringBuffer {

	public static void main(String[] args) {
		
		//this non changeable nature is nothing but immutability of the string object.
		String s= new String("Uma");
		s.concat("Mahesh");
		System.out.println(s);
		
		//Once we create a StringBuffer object we can perform any type of changes in the existing object. 
		//this changeable is nothing but mutability of the StringBuffer object. 
		StringBuffer sb = new StringBuffer("Uma");
		sb.append("Mahesh");
		System.out.println(sb);
		
	}

}
