package Interface;

public  abstract  class Shape {
	
	
	String name;
	float area;
	
	
	public Shape() {
		
	}
	public Shape(String name) {
		this.name=name;	
	}
	public abstract void findArea();
	
	public void printShape() {
		System.out.println("Name is----"  +name);
		System.out.println("Area is----"  +area);
		
	}

	}


