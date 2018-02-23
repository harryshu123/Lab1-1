package pkgCore;

//import java.util.LinkedList;

public class Round {

	private static  int ComeOutScore;
	private static  eGameResult eGameResult;
	//private LinkedList<Roll> rolls = new LinkedList<Roll>();
	
	private static int Rollround = 0;
		
		public static void main(String[] args) {
		
		Roll example1 = new Roll();
		ComeOutScore = example1.getScore();
		// TODO: Execute Come Out roll, value ComeOutScore
		switch (ComeOutScore) {
		case 7:
		case 11:
			eGameResult = pkgCore.eGameResult.NATURAL;
			System.out.println("the round is over: NATURAL");
			Rollround ++;
			System.out.printf("the roll round is %d", Rollround);
			break;
		case 2:
		case 3:
		case 12:
			eGameResult = pkgCore.eGameResult.CRAPS;
			System.out.println("the round is over: CRAPS");
			Rollround ++;
			System.out.printf("the roll round is %d", Rollround);
			break;
		case 4:
		case 5:
		case 6:
		case 8:
		case 9:
		case 10:
			eGameResult = pkgCore.eGameResult.CONTINUE;
			System.out.printf("Point is %d",ComeOutScore);
			Rollround ++;
			break;//test
		}
	
		
		while(eGameResult == pkgCore.eGameResult.CONTINUE) {
			Roll example2 = new Roll();
			ComeOutScore = example2.getScore();
			if(ComeOutScore == 4 || ComeOutScore == 5 || ComeOutScore == 6 || ComeOutScore == 8 || ComeOutScore == 9 || ComeOutScore == 10) 
			{	
				eGameResult = pkgCore.eGameResult.CONTINUE;
				Rollround ++;
				continue;
			}
			else if (ComeOutScore == 7) {
					eGameResult = pkgCore.eGameResult.SEVEN_OUT;
					Rollround ++;
					break;
				}
			else {
				eGameResult = pkgCore.eGameResult.POINT;
				Rollround ++;
				break;
			}
		}
		if (eGameResult == pkgCore.eGameResult.POINT) {
			System.out.println(" Win!!");
			System.out.printf("The roll count is: %d", Rollround);
			//System.out.println(Rollround);
			
		}
		else if (eGameResult == pkgCore.eGameResult.SEVEN_OUT){
			System.out.println(" Seven-out");
			System.out.printf("The roll count is: %d", Rollround);
			//System.out.println(Rollround);	
		}
		}


		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out

		// TODO: value the eGameResult after the round is complete

	public int RollCount() {
		// Return the roll count
		int roundnumber = Round.Rollround;
		return roundnumber;
	}
}

