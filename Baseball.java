 package Baseball;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double AB;
		double H;
		double twoB;
		double threeB;
		double HR;
		double R;
		double BB;
		String name;
		
		System.out.println("Please enter player's name: ");
		name = input.next();
		
		System.out.println("Please enter player's AB, H, twoB, threeB, HR, R, BB: ");
		AB = input.nextInt();
		
		H = input.nextInt();
		
		twoB = input.nextInt();
		
		threeB = input.nextInt();
		
		HR = input.nextInt();
		
		R = input.nextInt();
	
		BB = input.nextInt();
		
		double eBA = BA(H,AB);
		double eOBP = OBP(AB,H,BB);
		double eSLG = SLG(H,HR,AB,twoB,threeB);
		double eOBS = OBS(H,HR,AB,twoB,threeB,BB);
		double eTB = TB(H,twoB,threeB,HR);
		
		
		System.out.println("the BA is: "+eBA);
		System.out.println("the OBP is: "+eOBP);
		System.out.println("the SLG is: "+eSLG);
		System.out.println("the OBS is: "+eOBS);
		System.out.println("the TB is: "+eTB);
	}
	
	public static double  BA(double H, double AB) {
		double BA = H/AB;
		 return BA;
	}
	public static double OBP(double AB, double H, double BB) {
		double OBP = (H + BB)/(AB + BB);
		 return OBP;
	}
	public static double SLG(double H, double HR, double AB, double twoB, double threeB) {
		double SLG = (H + 2*twoB + 3*threeB + 4*HR)/AB;
		 return SLG;
	}
	public static double OBS(double HR, double AB, double twoB, double threeB, double BB, double H) {
		double SLG1 = (H + 2*twoB + 3*threeB + 4*HR)/AB;
		double OBP1 = (H + BB)/(AB + BB);
		double OBS = OBP1 + SLG1;
		return OBS;
	}
	public static double TB(double H, double twoB, double threeB, double HR) {
		double TB = H + 2*twoB + 3*threeB + 4*HR;
		return TB;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
