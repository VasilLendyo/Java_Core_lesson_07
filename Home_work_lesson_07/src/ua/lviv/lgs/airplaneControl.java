package ua.lviv.lgs;

public class airplaneControl {

	void moveUp() {
		System.out.println("moves up on " + (int) (Math.random() * 100) + " km");
	}

	void moveDown() {
		System.out.println("moves down on " + (int) (Math.random() * 100) + " km");
	}

	void moveLeft() {
		System.out.println("moves left on " + (int) (Math.random() * 100) + " km");
	}

	void moveRight() {
		System.out.println("moves right on " + (int) (Math.random() * 100) + " km");
	}

}
