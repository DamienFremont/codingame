import java.util.*;

class Player {

    public static void main(String a[]) {
	Scanner n = new Scanner(System.in);
	n.nextInt();
	n.nextInt();
	n.nextInt();
	int f = n.nextInt(), p = n.nextInt();
	n.nextInt();
	n.nextInt();
	int s = n.nextInt();
	HashMap<Integer, Integer> v = new HashMap<>(s);
	v.put(f, p);
	for (int i = 0; i < s; i++) {
	    v.put(n.nextInt(), n.nextInt());
	}
	while (true) {
	    int c = n.nextInt(), e = n.nextInt();
	    String d = n.next();
	    System.out.println((d.equals("LEFT") && v.get(c) > e) || (d.equals("RIGHT") && c >= 0 && v.get(c) < e)
	            ? "BLOCK" : "WAIT");
	}
    }
}