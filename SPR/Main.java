//Challenge1: Do it yourself again without looking
//Challenge 2: in switch case if i enter 3 it must say invalid output
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int computerMove=1;
        int userMove;//Camel Case 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your Move:");
        System.out.println("0.Scissor");
        System.out.println("1.Paper");
        System.out.println("2.Rock");

        Random rand = new Random();
        computerMove = rand.nextInt(3);// Random value starts with 0,1,2

        System.out.println("Please Enter your Move User:");
        userMove = scanner.nextInt();
       


        //Computer Move
        switch(computerMove){
          case 0:
            System.out.println("Computer has choose Scissor");   
            break;    

        case 1:
            System.out.println("Computer has choose Paper");
            break;
     
        case 2:
             System.out.println("Computer has choose Rock");
             break;
        }

        //User Move
        switch(userMove){
            case 0:
              System.out.println("User has choose Scissor");   
              break;    
  
          case 1:
              System.out.println("user has choose Paper");
              break;
       
          case 2:
               System.out.println("user has choose Rock");
               break;
          }

          //Move Algroithm
          if(computerMove==userMove){
            System.out.println("Same Move");
          }
          else if((computerMove==0 && userMove==1) || (computerMove==1 && userMove==2) || (computerMove==2 && userMove==0)){
            System.out.println("Computer Wins");
          }
          else{
            System.out.println("User Wins");
          }
    }
}