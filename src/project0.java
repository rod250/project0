import java.util.Random;
import java.util.Scanner;

public class project0 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random ran = new Random();
		int number = ran.nextInt(50);
		number += 1;
		
		System.out.println("Hello! Guess a number between 0 - 50");
		System.out.println("How many tries do you want to have?");
		
		int lives = scnr.nextInt();
		while(lives <= 0) {
			System.out.println("Error! Please pick another number:");
			lives = scnr.nextInt();
		}
			
		System.out.println("You will have " + lives + " tries");
		int tries = 1;	
		
		for(int i = 0; i < lives; i++) {
			System.out.println("Please make guess #" + tries);
			int guess = scnr.nextInt();
			
			if(guess == number){
				System.out.println("Congrats! That is the correct number!");
				break;
			}
			else if(guess > number && i != lives - 1){
				System.out.println("Your guess is higher than the number. Please pick again");
			}
			else if(guess < number && i != lives - 1){
				System.out.println("Your guess is lower than the number. Please pick again");
			}
			
			if(i == lives - 1) {
				System.out.println("You have run out of guesses!");
			}
			tries++;
		}
		System.out.println("Thank you for playing!");
	}

}
