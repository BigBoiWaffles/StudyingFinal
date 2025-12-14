public class PrimeTester{
	public static void main(String[] args){
		int number = Integer.parseInt(args[0]);
		if (isPrime(number)){
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

	public static boolean isPrime(int n){
		if (n < 2){
			return false;
		} else {
			for (int i = 2; i < n; i = i + 1){
				if (n % i == 0){
					return false;
				}
			}
		}
		return true;
	}
}
