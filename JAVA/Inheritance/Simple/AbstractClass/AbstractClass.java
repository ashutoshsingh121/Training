package Interface2;

public class AbstractClass {
	
	public static void main(String[] args)
	{
		
		Rectangle rec=new Rectangle(3, 4);
		rec.draw();
		System.out.println("Area of rectangle is "+rec.calculateArea());
		
	
		Circle cir=new Circle(3);
		cir.draw();
		System.out.println("Area of circle is "+cir.calculateArea());
		
	}

}
