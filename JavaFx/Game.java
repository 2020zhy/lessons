import java.util.Scanner;
import java.util.Random;

public class Game {
	public static void main(String[] args){
	System.out.println("##########");
	System.out.println("##      ##");
	System.out.println("## YT's  ##");
	System.out.println("##      ##");
	System.out.println("##########");
	System.out.println("");
	System.out.println("1: play    2: end");
	System,out.print(">");
	Scanner sc = new Scanner(System.in);
	String userInput = sc.nextInt();
	if(userInput ==1){
		System.out.println("Let's play");
	} else {
	System.out.println("##########");
	System.out.println("##      ##");
	System.out.println("## Game ##");
	System.out.println("## Over ##");
	System.out.println("##      ##");
	System.out.println("##########");
	}
	}

}
