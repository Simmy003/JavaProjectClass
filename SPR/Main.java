//Challenge1: Do it yourself again without looking
//Challenge 2: in switch case if i enter 3 it must say invalid output
//Challenge 3: after invalidnumber re run the program to make sure user hits valid number
//Challenge was very challenging.It actually challenged me



import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int computerMove;
        int userMove;     //Camel Case 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your Move:");
        System.out.println("0.Scissor");
        System.out.println("1.Paper");
        System.out.println("2.Rock");

        Random rand = new Random();
        computerMove = rand.nextInt(3);     // Random value starts with 0,1,2
        
        here:
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
        
            default:
                System.out.println("Please enter valid move");
             
        }

        //User Move
        if(userMove==0 || userMove==1 || userMove==2){
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
        }

        else{
          System.out.println("Please enter valid move");
          break here;
        }
       

          //Move Algroithm

          if(userMove==0 || userMove==1 || userMove==2){
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
          
          
}