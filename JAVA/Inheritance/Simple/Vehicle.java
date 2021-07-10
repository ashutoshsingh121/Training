package Programs;

public class Vehicle {

	String name;
	String color;
	float speed;

	public Vehicle() {
	} 
	
	
	public Vehicle(String name, String color, float speed) {
				this.name = name;
				this.color = color;
				this.speed = speed;
			}

			public void print() {
				System.out.println("Name is -- " + name);
				System.out.println("Color is --- " + color);
				System.out.println("Speed is --- " + speed);
			}

			public void accelerate() {
				System.out.println("Speed increased");
			}



	}
