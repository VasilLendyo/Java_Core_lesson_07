package ua.lviv.lgs;

public abstract class Airplane {
	void startingEngines() {

		System.out.println("Time to take off = " + (int) (Math.random() * 68 + 20) + " seconds");
	}

	void airplaneTakeOff() {
		System.out.println("Fly on full tank = " + (Math.random() * 1000) + " km");
	}

	void airplaneLanding() {
		System.out.println("Aiplane is landing");
	}

	private int lenght;
	private int width;
	private int weight;

	public Airplane(int lenght, int width, int weight) {
		super();
		this.lenght = lenght;
		this.width = width;
		this.weight = weight;
	}

}
