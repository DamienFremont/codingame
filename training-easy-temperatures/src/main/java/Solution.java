import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solution {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		Game game = new Game();
		Model model = new Model();
		Bot bot = new Bot();

		model = game.init(in, model);
		String output = bot.next_action(model);
		game.play(output);
	}
}

class Model {
	int temperaturesCount;
	List<Integer> temperatures;
}

class Bot {

	String next_action(Model model) {
		Integer minDiff = model.temperatures //
				.stream() //
				.min((p1, p2) -> Data.difference_from_0(p1, p2)) //
				.get();
		Log.debug("minDiff=" + minDiff);
		return minDiff.toString();
	}
}

class Data {
	
	static int difference_from_0(Integer p1, Integer p2) {
		return Integer.compare(//
				Math.abs(0 - p1), //
				Math.abs(0 - p2));
	}

}

class Game {

	Model init(Scanner in, Model model) {
		int n = in.nextInt();
		if (in.hasNextLine()) {
			in.nextLine();
		}
		String temps = in.nextLine();
		model.temperaturesCount = n;
		model.temperatures = Arrays //
				.asList(temps //
						.split(" ")) //
				.stream() //
				.map(i -> Integer.valueOf(i)) //
				.collect(Collectors.<Integer> toList());
		;
		Preconditions.check(model.temperaturesCount == model.temperatures.size());
		Log.debug("temperaturesCount=%d", model.temperaturesCount);
		Log.debug("temperatures=" + model.temperatures);
		return model;
	}

	void play(String output) {
		System.out.println(output);
	}
}

class Log {

	static void debug(String pattern, Object... values) {
		System.err.println(String.format(pattern, values));
	}
}

class Preconditions {
	static void check(boolean condition) {
		if (!condition)
			throw new RuntimeException("CONDITION FALSE");
	}
}