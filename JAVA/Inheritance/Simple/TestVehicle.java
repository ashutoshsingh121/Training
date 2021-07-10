package Programs;

public class TestVehicle {

	public static void main(String[] args) {
		Bike c =  new Bike();
		c.name="KTM";
		c.color="Black";
		c.speed=90;
		c.gearType="Auto";
		c.print();
		
		Bike bPar=new Bike("KTM","Black",90,"Auto");
		bPar.print();
		

	}

}
