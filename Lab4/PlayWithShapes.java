import java.util.Scanner;

public class PlayWithShapes {

	// 0) Review OO notes/examples from lecture
	// 1) Declare a variable "shapes" that will reference an array of reference to Shape
	private Shape[] shapes;
	
	public PlayWithShapes() {
	
		// 2) Make shapes equal a new array of 10 references to Shapes
		this.shapes = new Shape[10];

		
		// 3) point shapes[0], ..., shapes[9] to new Rectangles and Circles
		/** The list of Shapes should be ...
		 Color:red (5,5) Radius: 10
		 Color:green (20,15) Radius: 20
		 Color:orange (20,40) Width: 5 Height: 10
		 Color:blue (30,25) Radius: 15
		 Color:yellow (15,25) Width: 8 Height: 12
		 Color:purple (40,35) Radius: 25
		 Color:pink (10,30) Width: 12 Height: 18
		 Color:cyan (50,45) Radius: 18
		 Color:brown (35,20) Width: 20 Height: 25
		 Color:gray (60,55) Radius: 30
		 **/
       		 shapes[0] = new Circle("red", 10, 5, 5);
       		 shapes[1] = new Circle("green", 20, 20, 15);
       		 shapes[2] = new Rectangle("orange", 5, 10, 20, 40);
       		 shapes[3] = new Circle("blue", 15, 20, 25);
       		 shapes[4] = new Rectangle("yellow", 8, 12, 15, 25);
       		 shapes[5] = new Circle("purple", 25, 40, 35);
       		 shapes[6] = new Rectangle("pink", 12, 18, 10, 30);
       		 shapes[7] = new Circle("cyan", 18, 50, 45);
       		 shapes[8] = new Rectangle("brown", 20, 25, 35, 20);
       		 shapes[9] = new Circle("gray", 30, 60, 55);
	}
	
	/**
	 * Print the String representation of all Shapes referenced to 
	 * within the "shapes" array.s
	 * (This calls the .toString() method for each Shape).
	 */
	public void printShapes() {
		// UNCOMMENT AFTER YOU DEFINE shapes above
		for (Shape s:shapes) {
			System.out.println(s);
		}
	}
	
	// 4) Complete moveShapes below to satisfy its javadoc

	/**
	 * Change the position of all referenced Shapes in the shapes array 
	 * by the given dx and dy
	 * @param dx the amount to change all shapes x coordinates
	 * @param dy the amount to change all shapes y coordinates
	 */
	public void moveShapes(int dx, int dy) {
		//TODO: Complete this method
		for (Shape s:shapes){
			s.setPosition(dx, dy);
		}
	}

	// 4) Complete colorShapes below to satisfy its javadoc

	/**
	 * Change the color of all referenced Shapes in the shapes array
	 * to the given color
	 * @param c the color that all the shapes should be set to
	 */
	public void colorShapes(String c) {
		//TODO: Complete this method
		for (Shape s:shapes){
			s.setColor(c);
		}
	}
	
	
	public static void main(String[] args) {
		
		PlayWithShapes s = new PlayWithShapes();
		
		// 5) Move all of the shapes around a bit
		Scanner scanner=new Scanner(System.in);
		while(true){
			System.out.println("Enter 'move' or 'color': ");
			String choice = scanner.nextLine();
			if (choice.equals("move")) {
				System.out.print("dx: ");
				String dxs=scanner.nextLine();
				int dx=Integer.parseInt(dxs);
			
				System.out.print("dy: ");
				String dys=scanner.nextLine();
				int dy=Integer.parseInt(dys);
			
				s.moveShapes(dx, dy);
				s.printShapes();
			} else if (choice.equals("color")) {
				System.out.print("what color?: ");
				String newColor = scanner.nextLine();
				s.colorShapes(newColor);
				s.printShapes();
			}
		}
	}

}

