package report_190227;

import java.util.Random;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner);
		System.out.println("");
		System.out.println("");
		Random random = new Random();
		int myaction = 0;
		int opponentaction = 0;

		
		System.out.println("Baseball Game");
		System.out.println("");
		
		System.out.println("First, make a team");
		System.out.println("Please enter your team name");
		Team team = new Team(scanner.nextLine());
		
		System.out.println("");
		System.out.println("Your team name is " + team.name);
		System.out.println("You can recruit four players");
		
		System.out.println("");
		System.out.println("Please enter the first players name");
		team.getPlayer(0, scanner.nextLine());
		
		System.out.println("");	
		System.out.println("And enter the second player's name");
		team.getPlayer(1, scanner.nextLine());
		
		System.out.println("");	
		System.out.println("Enter the third player's name");
		team.getPlayer(2, scanner.nextLine());
		
		System.out.println("");	
		System.out.println("Enter the last player's name");
		team.getPlayer(3, scanner.nextLine());
		
		System.out.println("");
		System.out.println("All player names have been entered");
		System.out.println("Your team's information");
		System.out.println("");
		team.infomation();
		
		System.out.println("When you have finished verifying the information");
		System.out.println("please enter any key");
		scanner.nextLine();
		System.out.println("");
		
		System.out.println("");
		System.out.println("Begin a baseball game");
		System.out.println("");
		
		while(true) {

			int array[] = new int[6];
			for(int i =0; i<array.length; i++) {
				array[i] = i+1;
			}
			
			boolean count = true;
			int round = 1;
			
			while(round <= 3) {
				if(count == true) {
					System.out.println("");
					System.out.println(round + " Round First half");
					System.out.println("");
					
					System.out.println("Opponent pitches time");
					System.out.println("Match the direction of the opponents ball");
					System.out.println("NomalSwing(1~4) FullSwing(5) Wait(6)");
					
					while(Score.out < 3) {
						
						if(Score.change == true) {
							if(Score.playerNumber <= 2) {
								System.out.println("");
								System.out.println("player : " + team.player[Score.playerNumber] + " (number " + (Score.playerNumber+1) + ")");
								Score.playerNumber++;
							}else if (Score.playerNumber == 3){
								System.out.println("");
								System.out.println("player : " + team.player[3] + " (number " + (Score.playerNumber+1) + ")");
								Score.playerNumber = 0;
							}
						}
						
						Score.change = false;
												
						System.out.println("");
						System.out.println("opponent pitches");

						
						myaction = scanner.nextInt();
						opponentaction = array[random.nextInt(5)];
						
						if(myaction == opponentaction) {
							if(myaction == 5) {
								System.out.println("");
								System.out.println("Homrun!");
								Score.homRun();
							}else {
								System.out.println("");
								System.out.println("safety");
								Score.change = true;
								Score.position();
							}
						}else if(myaction != opponentaction) {
							if(myaction == 6){
								if(opponentaction < 3) {
									System.out.println("");
									System.out.println("ball");
									Score.ball();
								}else {
									System.out.println("");
									System.out.println("strike");
									Score.strike();
								}	
							}else {
								System.out.println("");
								System.out.println("strike");
								Score.strike();
							}
						}
					}
					System.out.println("First half end");
					System.out.println("");
					System.out.println("Your team : " + Score.myScore + " vs " + "Opponent team : " + Score.opponentScore);
					System.out.println("");
					Score.strike = 0;
					Score.ball = 0;
					Score.out = 0;
					
					for(int i = 0; i < 3; i++) {
						Score.position[i] = 0;
					}
					
					count = false;
					Score.pitcherCheck = false;
					
				}else if(count == false){
					System.out.println("");
					System.out.println(round + " Round last half");
					System.out.println("");
					
					System.out.println("Your pitches time");
					System.out.println("Match the direction of the opponents bat");
					System.out.println("Ball(1~2) Side(3~4) Center(5)");
					
					while(Score.out < 3) {
												
						System.out.println("");
					
						System.out.println("");
						System.out.println("my pitches");

						
						myaction = scanner.nextInt();
						opponentaction = array[random.nextInt(6)];
						
						if(opponentaction == myaction) {
							if(opponentaction == 5) {
								System.out.println("");
								System.out.println("Homrun!");
								Score.homRun();
							}else {
								System.out.println("");
								System.out.println("safety");
								Score.position();
							}
						}else if(opponentaction != myaction) {
							if(opponentaction == 6){
								if(myaction < 3) {
									System.out.println("");
									System.out.println("ball");
									Score.ball();
								}else {
									System.out.println("");
									System.out.println("strike");
									Score.strike();
								}	
							}else {
								System.out.println("");
								System.out.println("strike");
								Score.strike();
							}
						}
					}
					System.out.println("Last half end");
					System.out.println("");
					System.out.println("Your team : " + Score.myScore + " vs " + "Opponent team : " + Score.opponentScore);
					System.out.println("");
					Score.strike = 0;
					Score.ball = 0;
					Score.out = 0;
					
					for(int i = 0; i < 3; i++) {
						Score.position[i] = 0;
					}
					
					count = true;
					Score.pitcherCheck = true;
					round++;
				}
			}
			
			System.out.println("Game end");
			System.out.println("");
			System.out.println("");
			
			if(Score.myScore > Score.opponentScore) {
				System.out.println("You Win");
				System.out.println("");
			}else if(Score.myScore == Score.opponentScore) {
				System.out.println("Draw game");
				System.out.println("");
			}else {
				System.out.println("You Lose");
				System.out.println("");
			}
			
			System.out.println("");
			System.out.println("Thank you for playing!!");
			System.out.println("");
			System.out.println("");
			
			System.out.println("Made By : Kang In, Jung Hyeon-Uk");
			
			break;
			
		}
	}
}
