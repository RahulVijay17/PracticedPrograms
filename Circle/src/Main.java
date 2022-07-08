import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		System.out.println("enter the radius of Circle");
		double radius = input.nextDouble();
		System.out.println("the perimeter is= "+(2*radius*Math.PI));
		System.out.println("the area is ="+ (Math.PI*radius*radius));
		
	}

}
