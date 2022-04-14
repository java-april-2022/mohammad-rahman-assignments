public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomething() {
		System.out.println("Heads up!!!!");
		energyLevel -= 5;
	}
	public void eatBanana() {
		System.out.println("Chiquita!!");
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("Geronimooooooo!");
		energyLevel -= 10;
	}
}
