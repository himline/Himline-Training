package assigne.himline.com;

abstract class MotorCar {
	public abstract void fuel();

	public abstract void brake();

	public void airConditioning() {
		System.out.println("Air conditioning is optional");
	}
}

