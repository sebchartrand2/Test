import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter string to convert");
		
		String inputString = keyboard.nextLine().toLowerCase();
		

		
		for(int i =0;i < inputString.length();i++) {
			char tempChar =inputString.charAt(i);
			String tempElement = "";
			if (Character.isLetter(tempChar)) {
				System.out.print("veuillez mettre un chiffre en premier");
			}else if (Character.isDigit(tempChar)) {
				tempElement += tempChar;
				
			}
				
				
			System.out.print(inputString.charAt(i));
		}
		
//		Character.isDigit(inputString.charAt(index))
//		Character.isLetter(inputString.charAt(index))
	}

}
