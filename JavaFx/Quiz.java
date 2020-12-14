 import java.util.Random;
 import java.util.Scanner;

   public class Quiz{
    Scanner sc = new Scanner(System.in);
     public static void main ( String[] args ) {
      starGame();
      printMenu();
      String userChoice = sc.nextLine();
      if("1".equals(userChoice)) {
        playGame();
      }
    //  endGame();

}
public static void starGame(){
  System.out.println("###################");
  System.out.println("#  My First Game  #");
  System.out.println("#  ver.1          #");
  System.out.println("#  by yoshino     #");
  System.out.println("###################");
}
public static void printMenu() {
  System.out.println("1:play   2:end");

 System.out.println("select:");
}
public static void playGame() {
   System.out.println( "田中先生と吉野、どちらが年上でしょうか." );
       System.out.println( "1: 田中先生   2: 吉野   3: 2人は同じ年" );
       String userChoice = sc.nextLine();
       if ( "2".equals( userChoice ) ) {
         System.out.println( "正解です！" );
       } else {
         System.out.println( "ちがいます。田中先生と吉野は同じ年です。" );
       }

}
}