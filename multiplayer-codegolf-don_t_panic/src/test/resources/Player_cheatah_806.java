import java.util.*;

class Player {

    public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	int nbFloors = in.nextInt();
	int width = in.nextInt();
	int nbRounds = in.nextInt();
	int exitFloor = in.nextInt();
	int exitPos = in.nextInt();
	int nbTotalClones = in.nextInt();
	int nbAdditionalElevators = in.nextInt();
	int nbElevators = in.nextInt();
	HashMap<Integer, Integer> elevators = new HashMap<Integer, Integer>(nbElevators);
	elevators.put(exitFloor, exitPos);
	for (int i = 0; i < nbElevators; i++) {
	    elevators.put(in.nextInt(), in.nextInt());
	}

	while (true) {
	    int cloneFloor = in.nextInt();
	    int clonePos = in.nextInt();
	    String dir = in.next();
	    if ((dir.equals("LEFT") && elevators.get(cloneFloor) > clonePos)
	            || (dir.equals("RIGHT") && cloneFloor >= 0 && elevators.get(cloneFloor) < clonePos)) {
		System.out.println("BLOCK");
	    } else {
		System.out.println("WAIT");
	    }
	}
    }
}