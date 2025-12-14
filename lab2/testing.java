public class testing{
	public static void main(String[] args){
		Person p1;
		p1 = new Person("Tristan");
		System.out.println(p1);

		Person p2 = new Person("Nicasio");
		System.out.println(p2);

		SodaCan s1 = new SodaCan("RootBeer");
		System.out.println(s1);

		s1.open();
		
		p1.sipFrom(s1);
		System.out.println(s1);	
	}
}
