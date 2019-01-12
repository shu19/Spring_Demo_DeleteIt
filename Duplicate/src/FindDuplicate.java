import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Employee {

	public String name = "Shubham";
}

public class FindDuplicate {

	static Employee l = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isDuplicate("jafer"));
//		add((short) 10);
	}

	public static void add(long a) {
		System.out.println("long " + a);
	}

	public static void add(short a) {
		System.out.println("short " + a);
	}
	/*
	 * public static void add(int a) { // float aa=10.5; System.out.println("int " +
	 * a); }
	 */

	/*
	 * public static boolean isDuplicate(String str) { HashMap<Character, Integer>
	 * hmap = new HashMap<Character, Integer>(); for (int index = 0; index <
	 * str.length(); index++) {
	 * 
	 * if (hmap.containsKey(str.charAt(index))) { return true; } else {
	 * hmap.put(str.charAt(index), 1); } } return false; }
	 */
	public static boolean isDuplicate(String str) {
		Set<Character> s = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			if (!s.add(str.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * public void m1() { List<String> l = new ArrayList<>(); l.forEach(obj ->
	 * System.out.println(obj));
	 * 
	 * }
	 */
}
