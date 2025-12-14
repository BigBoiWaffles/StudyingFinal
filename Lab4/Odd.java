import java.util.ArrayList;

public class Odd {
	/**
	 * Returns all odd numbers less than n
	 * @param n
	 * @return an array list of positive odds less than n [1, 3, 5, ...]
	 */
	public static ArrayList<Integer> odds(int n){
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		for (int i = 0; i < n; i = i + 1){
			if (i % 2 != 0){
				oddNumbers.add(i);
			}
		}
		return oddNumbers;
	}
	public static void main(String[] args){
		ArrayList<Integer> oddLessThan100 = odds(100);
		System.out.println(oddLessThan100);
	}
}
