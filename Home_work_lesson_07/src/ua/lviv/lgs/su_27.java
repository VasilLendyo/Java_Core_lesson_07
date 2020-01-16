package ua.lviv.lgs;

public class su_27 extends Airplane implements AirplaneAccessibility {

	@Override
	public void turboAcceleration() {
		System.out.println(
				"Turbo acceleration is on, airplane speed = " + (int) (Math.random() * maxSpeed + 420) + " km");

	}

	@Override
	public void stelthTechnology() {
		System.out.println("The airplane isinvisible for " + (int) (Math.random() * 100) + " seconds");

	}

	@Override
	public void nuclearStrike() {
		System.out.println("Released " + (int) (Math.random() * 10) + " nuclear warheads");

	}

	private int maxSpeed;
	private String color;

	public su_27(int lenght, int width, int weight, int maxSpeed, String color) {
		super(lenght, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	airplaneControl cn = new airplaneControl();

	public void toUp() {
		cn.moveUp();
	}

	public void toDown() {
		cn.moveDown();
	}

	public void toRight() {
		cn.moveRight();
	}

	public void toLeft() {
		cn.moveLeft();
	}

}
