package task1.codsoft;
import java.util.Scanner;
public class NumberGame {
	public static void guessGenratedNo() {		
		String playAgain;		
		do {
			int min_no = 0;
			int max_no = 100;
			int random = (int) (Math.random() * (max_no - min_no + 1) + min_no);
			System.out.println(random);
			int n = random;
			int score=1;
			int maxAttempts = 5;
			boolean correctGuess = false;
			Scanner sc = new Scanner(System.in);	
			System.out.println("Enter your guess no. 1 to 100");
			for(int i = 1 ; i<=maxAttempts; i++) {
				
				int UGuessNo = sc.nextInt();
				if(UGuessNo>100) {
					System.out.println("you have entered greater than 100.. ");
					break;
				}
				
				if(UGuessNo==n) {
					correctGuess = true;
					break;
				}
				else {
					if(UGuessNo>n) {
						System.out.println("guess is too high");
					}else
						System.out.println("guess is too Low");
					}	
				score++;
				}
			if(correctGuess == true) {
				System.out.println("Congratulation! Guess is Correct.... \n user Score: "+score);
			}
			else {
				System.out.println("Sorry! you Lost your Chances ... play again ");
			}
			
			System.out.println("For play another round enter (Y/YES) , For EXIT press any key");
			playAgain = sc.next().toLowerCase();
		}while(playAgain.equals("y") || playAgain.equals("yes"));
		
		System.out.println("*******************Thanks, For Playing************");		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to CodSoft  Task_1 ,Number Game ");
	
		guessGenratedNo();
		

	}

}
