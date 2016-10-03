/****************************************************************************
 *
 * Created by: Jess 
 * Created on: Oct 2016
 * Assignment 2b
 *  Rock, Paper,Scissros
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RockPaperScissors {

	public static void main(String[] args) throws IOException {
		//1 is rock, 3 is paper, 2 is scissors
		
		int userMoveNumber = 4;
		int computerMove;
		
		computerMove = (int) (Math.random()*3 + 1); 
		
		//just for test cases this needs to be here
		System.out.println(computerMove);
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.println("Type: rock, paper, or scissors *No commas, all in lowercase");
		
		String userMove = br.readLine();
		
		if (userMove.equals("rock"))
		{
			
			userMoveNumber = 1;
			
		} else if (userMove.equals("paper")) {
			
			userMoveNumber = 3;
			
		} else if (userMove.equals("scissors")) {
			
			userMoveNumber = 2;
			
		} else {
			
			userMoveNumber = 4;
			
			System.out.println("Invalid input.");
			
		}
		
		if (computerMove == userMoveNumber) {
			
			System.out.println("It's a tie!");
			
		} else if (computerMove == 3 && userMoveNumber == 1) {
			
			System.out.println("You lose!");
			
		} else if (computerMove > userMoveNumber){
			
			System.out.println("You win!"); 
			
		} else {
			
			System.out.println("You lose!");
			
		}

	}

}
