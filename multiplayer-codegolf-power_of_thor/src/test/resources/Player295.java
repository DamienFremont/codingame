class Player {
	public static void main(String s[]) {
		java.util.Scanner i = new java.util.Scanner(System.in);
		int x = i.nextInt(), y = i.nextInt(), a = i.nextInt(), b = i.nextInt();
		while (true) {
			String p = "";
			if (b < y) {
				p += "S";
				b++;
			}
			;
			if (b > y) {
				p += "N";
				b--;
			}
			;
			if (a < x) {
				p += "E";
				a++;
			}
			;
			if (a > x) {
				p += "W";
				a--;
			}
			;
			System.out.println(p);
		}
	}
}