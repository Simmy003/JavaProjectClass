
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random random=new Random();
        int num=random.nextInt(10);
        int guessNumber=0;
        Scanner scanner=new Scanner(System.in);
        int count=0;

        
      

        while(num!=guessNumber){
            count++;
            System.out.println("Guess a number from 1 to 5");
            guessNumber = scanner.nextInt();

            if(guessNumber==num){
                System.out.println("Your guess is correct");
                System.out.println("this this:"+count);
            }
            else if(guessNumber>num){
                System.out.println("Your guess is high");
            }
            else{
                System.out.println("Your guess is low");
            }
        }
       
    }
}
