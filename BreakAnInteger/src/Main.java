import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Input 6 digit non-negative number: ");
		String number = in.next();

		for(int i = 0; i < number.length(); i++)
		{
		System.out.print(number.charAt(i) + " ");
	}
	}
}
