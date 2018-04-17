import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Listsample {
	public static void main(String[] args) {
		   List <String> al = new ArrayList<String>();
		   al.add("Chaitanya");
		   al.add("Rahul");
		   al.add("");
		   al.add("Ajeet");
		   al.add("Chaitanya");
		   al.add("");
		   al.add("Chaitanya");
		   al.add("");
		   System.out.println("ArrayList Elements: ");
		   System.out.print(al);

		   List <String> ll = new LinkedList<String>();
		   ll.add("");
		   ll.add("Kevin");
		   ll.add("Peter");
		   ll.add("");
		   ll.add("Kate");
		   ll.add("Peter");
		   ll.add("");
		   System.out.println("\nLinkedList Elements: ");
		   System.out.print(ll);
		 }
}
