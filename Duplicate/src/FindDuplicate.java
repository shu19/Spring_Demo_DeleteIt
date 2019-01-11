import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Employee {

	public String name = "Shubham";
}

public class FindDuplicate {

	static Employee l = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isDuplicate("RAJA"));

	}

	
	public static boolean isDuplicate(String str) {
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int index = 0; index < str.length(); index++) {

			if (hmap.containsKey(str.charAt(index))) {
				return true;
			} else {
				hmap.put(str.charAt(index), 1);
			}
		}
		return false;
	}

	/*
	 * public static boolean isDuplicate(String str) { Set s=new HashSet(); for(int
	 * i=0;i<str.length();i++) { if(!s.add(str.charAt(i))){ return true; } } return
	 * false; }
	 */
}
