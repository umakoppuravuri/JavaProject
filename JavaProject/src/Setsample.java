import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Setsample {
		
	 public static void main(String[] args) {
		 int count[] = {11, 22, 33, 44, 55,33,11,55};
		    Set<Integer> hset = new HashSet<Integer>();
		    try{
		      for(int i = 0; i<8; i++){
		         hset.add(count[i]);
		      }
		      System.out.println(hset);
		 
		      TreeSet<Integer> treeset = new TreeSet<Integer>(hset);
		      System.out.println("The sorted list is:");
		      System.out.println(treeset);
		    }
		    catch(Exception e){
		        e.printStackTrace();
		    }
	 }
	}

