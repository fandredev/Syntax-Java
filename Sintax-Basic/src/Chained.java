
public class Chained {
	public static void main(String[] args) {
		for (int multiply = 1; multiply <= 10; multiply++) {
			for (int counter = 0; counter <= 10; counter++) {
				System.out.print(multiply * counter);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
