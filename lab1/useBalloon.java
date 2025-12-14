public class useBalloon {
	public static void main(String [] args){
		Balloon b;
		b = new Balloon();

		// Can also be 
		// Balloon b = new Balloon();

		b.inflate(3);

		Balloon b2 = new Balloon();
		System.out.println(b);
		System.out.println(b2);
	}
}
