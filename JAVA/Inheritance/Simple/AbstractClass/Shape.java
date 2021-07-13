package Interface2;
abstract class Shape{
		 
		public void draw()
		{
		
		}
		
		public abstract double calculateArea();
	}
	 
	class Rectangle extends Shape
	{	
		double length;
		double breadth;
		
		
		public Rectangle(double length, double breadth) {
			super();
			this.length = length;
			this.breadth = breadth;
		}
	 
		@Override
		public double calculateArea() {		
			return length*breadth;
		}
	}
	 
	class Circle extends Shape
	{
	    double radius;
	        
		public Circle(double radius) {
			super();
			this.radius = radius;
		}
	 
		@Override
		public double calculateArea() {
			return 3.14*radius*radius;
		}
	}
	
