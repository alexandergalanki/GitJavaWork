package automobiles;

public class Car {
	public int seats;
	public int wheels;
	public String carname;
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public boolean isKeyStatus() {
		return keyStatus;
	}
	public void setKeyStatus(boolean keyStatus) {
		this.keyStatus = keyStatus;
	}
	private boolean keyStatus;

}
