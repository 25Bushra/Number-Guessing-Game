package game;

import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {

	public static void main(String[] args) {
		
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		
		int minNo = 1;
        int maxNo = 100;
        int score = 0;
		
		System.out.println("Number Guessing Game");
		
		int randNo = rand.nextInt(maxNo - minNo + 1) + minNo;

        int maxAttempts = 8;
        int attempts = 0;
		
		while(attempts < maxAttempts) {
			System.out.println("Guess the number between(1-100): ");
			
			int guessNo=sc.nextInt();
			attempts++;
			
			if(guessNo == randNo) {
				System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	            score += (maxAttempts - attempts + 1) * 10;
				break;
			}
			else if(randNo>guessNo){
				System.out.println("Number is higher. Guess again.");
			}
			else {
				System.out.println("Number is lower. Guess again.");
			}
			if (attempts == maxAttempts) {
	                System.out.println("Sorry, you've run out of attempts. The correct number was: " + randNo);
	        }
		
		}
		System.out.println("Your score: " + score);
        sc.close();

	}

}
