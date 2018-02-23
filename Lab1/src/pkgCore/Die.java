package pkgCore;
import java.util.Random;
public class Die {

	private int DieValue;

	public Die() {
		DieValue = new 	Random().nextInt(6) + 1;//; means end of statement	
				// TODO: Determine DieVaue.. a random number between 1 and 6
	}

	public int getDieValue() {
		return DieValue;
	}
}
