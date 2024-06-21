import java.util.Random;
import java.util.Scanner;

public class GuesstheNum{
    public static void main(String[] args) {
        int userguess=0;    //for user
        Random rand=new Random();
        int computerguess=rand.nextInt(10);
        Scanner scanner=new Scanner(System.in);
        int counter=0;

        
        while(userguess!=computerguess){
            counter++;
            
            System.out.println("Guess a number from 1 to 10");
            userguess=scanner.nextInt();
            
            if(userguess==computerguess){
                System.out.println("Your guess is correct");
                System.out.println("You took:" +counter+"tries");
            }
            else if(userguess>computerguess){
                System.out.println("Your guess is high");
            }
            else{
                System.out.println("Your guess is low");
             }

        }
    
    }
}