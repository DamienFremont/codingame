import java.util.*;

class Solution {
	public static void main(String s[]) {
		Scanner i = new Scanner(System.in);
		i.nextLine();
		Integer r = null;
		while (i.hasNextInt()) {
			int t = i.nextInt();
			r = r == null || Math.abs(t) < Math.abs(r) || (Math.abs(t) == Math.abs(r) && t > 0) ? t : r;
		}
		System.out.println(r == null ? 0 : r);
	}
}
