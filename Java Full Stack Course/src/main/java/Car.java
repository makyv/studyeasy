
public class Car {

	private String door;
	private String engine;
	private String driver;
	private int speed;
	
	
	
	
	
	public Car(String door, String engine, String driver, int speed) {
		super();
		this.door = door;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String run() {
		if(door.equals("closed") && engine.equals("on")
				 && driver.equals("seated") && speed > 0) {
			return "runing";
		}else {
			return "not runing";
		}
	}
	
	
	
	
	
}
