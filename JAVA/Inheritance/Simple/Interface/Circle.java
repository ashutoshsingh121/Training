package Interface;

public class Circle extends Shape {
	
	float radius;
	
	public Circle() {
		
	}
	public Circle(String name, float radius)
	{
		super(name);
		this.radius=radius;
	}
	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		area=3.14f*radius*radius;
		
	}
	@Override
	public void printShape() {
		// TODO Auto-generated method stub
		System.out.println("Radius--"  +radius);
		super.printShape();
		
	}
	
	

}
