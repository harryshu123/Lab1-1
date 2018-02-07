package pkgCore;

public class Die {

	private int DieValue;

	public Die() {
		DieValue = rand.nextInt(5) + 1;
		// TODO: Determine DieVaue.. a random number between 1 and 6
	}

	public int getDieValue() {
		return DieValue;
	}
}
