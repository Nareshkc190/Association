
public class Car {
	
	private Wheel wheels;
	private Engine engine;
	private Seat seat;
	
	Car() {
		
	}
	
	
	public String toString() {
		return "Car [wheels=" + wheels + ", \n engine=" + engine + ", \n seat=" + seat + "]";
	}




	public Car(Wheel wheels, Engine engine, Seat seat) {
		super();
		this.wheels = wheels;
		this.engine = engine;
		this.seat = seat;
	}

	Car(Engine e, Wheel w) {
		this.engine = e;
		this.wheels = w;
	}

	
	/*
	 * public Engine(double cylinderCapacity, String engineType,
			int numberOfCylinders, double horsePower) {
	 */
	public static void main(String[] args) {
		
	     //	Car c = new Car(new Engine(1.8, "Petrol", 5, 250), new Wheel(34.5, "Tata", 24));
		//System.out.println(c.wheels.getBrand());
		
		Car d = new Car(new Wheel(34.5, "Tata", 24), new Engine(1.8, "Petrol", 5, 250), new Seat("leather", "foam", "guci", "summer", true, true));
		System.out.println(d);
		d.engine.start();
		d.engine.accelerate();
	}

}
