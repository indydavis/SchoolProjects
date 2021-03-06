import java.util.Scanner;
/* Indiana Davis, 
* TCSS 142B - Autumn 2013
* Homework 3
*/
/** Requests the length of sides of a triangle and outputs the angle.
  * @author Indiana Davis
  * @version October 22, 2013
  */
public class Angels{
	/** Main method requests input from user and outputs angle value in radians.
	 *  @param args is not used, ignored.
	 */
	public static void main(String[] args){
		Scanner length = new Scanner(System.in);
		System.out.println("The triangle has three sides; A, B, and C.");
		System.out.println("Each side has and opposite angle on the triangle;");
		System.out.println("named alpha, beta, and gama respectively.");
		System.out.print("Please enter the length of side A:");
		double sideA = length.nextDouble();
		System.out.print("Please enter the length of side B:");
		double sideB = length.nextDouble();
		System.out.print("Please enter the length of side C:");
		double sideC = length.nextDouble();
		length.close();
		System.out.print("The magnitude of alpha is:");
		double p = (Math.pow(sideB, 2) - Math.pow(sideA, 2) + Math.pow(sideC, 2) / (2 * sideB * sideC));
		double a = Math.acos(p);
		System.out.printf("a = %.3f", a);
		System.out.println();
		System.out.print("The magnitude of beta is:");
		double j = (Math.pow(sideA, 2) - Math.pow(sideB, 2) + Math.pow(sideC, 2) / (2 * sideA * sideC));
		double b = Math.acos(j);
		System.out.printf("b = %.3f", b);
		System.out.println();
		System.out.print("The magnitude of gama is:");
		double n = (Math.pow(sideA, 2) - Math.pow(sideC, 2) + Math.pow(sideB, 2) / (2 * sideA * sideB));
		double c = Math.acos(n);
		System.out.printf("c = %.3f", c);
	}
}