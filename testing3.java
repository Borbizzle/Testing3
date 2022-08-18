
/**
 * Chance Borba
 * Kanemoto
 * 11/8/17
 *
 */


import java.text.DecimalFormat;
public class testing3 {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.0");
		System.out.println("x1\ty1\tx2\ty2\tDistance");
		
		for(int x1 = 1; x1<=51; x1+=2) {
			double distance = distance(x1, 5, -1, -1);
			System.out.println(x1 + "\t\t\t\t" + df.format(distance));
		}
		System.out.println("x1\ty1\tx2\ty2\tDistance\t\t\t\tSlope");
		
		DecimalFormat df2 = new DecimalFormat ("#.0");
		
		
		for(int x1 = 1; x1<=51; x1+=2) {
			double distance = distance(x1, 5, -1, -1);
			double slopeOfTwoPlane = slopeOfTwoPlane (x1,5,-1,-1);
			System.out.println(x1 + "\t\t\t\t" + df.format(distance) + "\t\t\t\t" + df2.format(slopeOfTwoPlane));
			

			
			
		}
	}

	public static double DEF(int a, int b){
		double DEF = Math.pow( a, 2) + Math.pow( b, 2);
		return DEF;
		
	}
	
	
	public static double distance(int x1, int y1, int x2, int y2){
		return Math.sqrt(Math.pow ((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
	}
	
	public static double slopeOfTwoPlane(int x1, int y1, int x2, int y2) {

	double slopeOfTwoPlane = (y2 - y1)/(x2 - x1);
	return slopeOfTwoPlane;
	}
}
