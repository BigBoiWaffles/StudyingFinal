// Complete this class.

public class Square extends Rectangle{

	public Square(){
		this("blue", 10, 100, 100);
	}

	public Square(String c, int width, int x, int y){
		super(c, width, width, x, y);
	}

	@Override
	public void setWidth(int w){
		if (w > 0){
			super.setHeight(w);
			super.setWidth(w);
		}
	}

	@Override
	public void setHeight(int h){
		if (h > 0){
			super.setHeight(h);
			super.setWidth(h);
		}
	}

    public static void main(String[] args){
        Square s = new Square();
        System.out.println(s);
        s.setWidth(10);
        System.out.println(s);
        s.setHeight(20);
        System.out.println(s);

        /**
            Outputs:
            Color:blue (100,100) Width: 10 Height: 10
            Color:blue (100,100) Width: 10 Height: 10
            Color:blue (100,100) Width: 20 Height: 20
         **/


    }

}

