public class calcDigSum {
	
	public static void main(String[] args) {

		if(args.length != 1) {
			System.out.println("USAGE: <INT_TO_FIND_DIGIT_ROOT_OF>");
			System.exit(1);
		}

		int a = Integer.parseInt(args[0]);

		System.out.println("The digit sum of " + a + " is: " + getDigSum(a));

	}

	public static int getDigSum(int a) {

		int temp = a;

		if(temp % 9 == 0) {
			return 9;
		} else {
			while (temp > 9) {
				temp = temp - 9 * (a / 9);
			}
			return temp;
		}

	}

}