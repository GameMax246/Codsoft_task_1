import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit you want:");
        int max=scanner.nextInt(); 
        int min=1;
        boolean game=true;
        int maxattempt=10;
        int totalscore=0;
        while(game){
            int n = random.nextInt(max);
            int attempt=0;
            boolean guess=false;
            System.out.println("Enter the Number Between "+min+" and "+max);
            System.out.println();
            while(attempt<maxattempt){
                 System.out.println("Guess the number:");
                 int value= scanner.nextInt();
                  attempt++;
                 if(n==value){
                     guess=true;
                     System.out.println();
                      System.out.println(" You Finds the Correct Answer");
                      System.out.println();
                      totalscore = totalscore+ maxattempt-attempt;
                      break;
                 }
                 else if(n>value){
                      System.out.println("You Entered too Low");
                 }
                 else{
                      System.out.println("You Entered too High");
                 }
            }
            if(!guess){
                 System.out.println("You Ran Out Of Luck ");
            }
             System.out.println("You Finished this Game in "+attempt+" Attempt");
             System.out.println();
             System.out.println("Your Total Score is "+totalscore);
             System.out.println();
              System.out.println("Do you want to play again say(YES OR NO)");
              String play = scanner.next();
              switch(play){
                  case"yes":{
                      game=true;
                      break;
                  }
                  case"no":{
                      game=false;
                  }
              }
              System.out.println();
        }
    }}