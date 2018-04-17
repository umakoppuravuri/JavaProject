// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;

class Solution {
	public static void main(String args[]) {
		Solution st = new Solution();
		int output = st.solution(new int[] {1, 2, 3});
		System.out.println(output);
	}

	public int solution(int[] A) {
		// write your code in Java SE 8
		int output = 0;
		Arrays.sort(A);
		ArrayList<Integer> c = new ArrayList<Integer>();
		for (int i = 1; i <= (A.length); i++) {
			System.out.println(A[i-1]+"..."+ A[i]);
			c.add(A[i-1]);
			// if ((i + 1) < A.length) {
				if (A[i-1] == A[i]) {
					i++;
				}
			// }
		}
		System.out.println(c);
		int[] cc = c.stream().mapToInt(i -> i).toArray();
		for (int k = 0; k < cc.length; k++) {
			if ((k + 1) < cc.length) {
				if (( cc[k + 1] -  cc[k]) > 1) {
					output = cc[k] + 1;
					break;
				}
			}
		}
		/*if(output==0){
			output = cc[cc.length-1]+1;
		} else if(output<0){
			output = 1;
		}*/
		return output;
	}
}