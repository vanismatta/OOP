
public class Assignment4 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] test_array = { 3, 7, 1 };
		int p = 2;

		int sumResult = sumIntArray(test_array);
		System.out.println("Sum of the array: " + stringArray(test_array) + " is: " + sumResult);

		int[] powResult = powerIntArray(test_array, p);
		System.out.println("Power of the array for p = " + p + " is: " + stringArray(powResult));

		int powSumResult = powerSumIntArray(test_array, p);
		System.out.println(
				"Sum of power array for " + stringArray(test_array) + " p = " + p + " is: " + powSumResult);
	}

	public static int sumIntArray(int[] test_array) {
		int sumResult = 0;
		for (int i = 0; i < test_array.length; i++) {
			sumResult += test_array[i];
		}
		return sumResult;

	}

	public static int[] powerIntArray(int[] test_array, int p) {
		int[] powResult = new int[test_array.length];
		for (int i = 0; i < test_array.length; i++) {
			powResult[i] = (int) Math.pow(test_array[i], p);
		}
		return powResult;
	}

	public static int powerSumIntArray(int[] test_array, int p) {
		int[] result = new int[test_array.length];
		int powSumResult = 0;
		for (int i = 0; i < test_array.length; i++) {
			result[i] = (int) Math.pow(test_array[i], p);
		}
		for (int j = 0; j < result.length; j++) {
			powSumResult += result[j];
		}

		return powSumResult;
	}

	public static String stringArray(int[] argArray) {

		String out = "{ ";

		for (int element : argArray) {
			out += element + ", ";
		}

		out = out.substring(0, out.length() - 2) + " }";

		return out;
	}

}
