
import java.util.Scanner;

public class hexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Type in a number between 1 and 15 and I will convert it to hexadecimal");
		int input = keyboard.nextInt();
		if (input <= 1 || input >= 15)
		{
			System.out.println("Input not within peramitters");
		}
		else
		{
			String hex = Integer.toHexString(input);
			System.out.println(input+ " in decimal is "+ hex+ " in Hexadecimal");
		}
	}

}
