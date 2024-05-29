package vowelConsonant;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			char a = getChar(scanner, "Enter a character: ");
			String letterType = letterType(a);
			System.out.println("The type of " + "[" + a + "]" + " is " + letterType + ".");
		} finally {
			scanner.close();
		}

	}

	private static char getChar(Scanner scanner, String prompt) {
		boolean validChar = false;
		String ch = "";
		while (!validChar) {
			System.out.println(prompt);
			ch = scanner.nextLine();
			ch = ch.trim();

			if (ch.length() == 0) {
				System.out.println("No character entered.");
			} else if (!Character.isLetter(ch.charAt(0))) {
				System.out.println("Please enter a valid alphabetic character.");
			} else if (ch.length() > 1) {
				System.out.println("Please enter only one character.");
			}

			else {
				validChar = true;
			}
		}

		return ch.charAt(0);
	}

	private static String letterType(char letter) {
//		other way to convert letter to lowercase.
		/*
		 * if (letter >= 'A' && letter <= 'Z') { letter += 32; }
		 */

//		more Simple and readable 		
		letter = Character.toLowerCase(letter);

//		return the type of letter by using switch case statement. 
		switch (letter) {
		case 'i', 'u', 'o', 'e', 'a':
			return "Vowels";
		default:
			return "Consonant";
		}

	}

}
