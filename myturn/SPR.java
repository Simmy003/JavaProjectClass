import java.util.Random;
import java.util.Scanner;

public class SPR {
    public static void main(String[] args) {
        int userMove;
        int computerMove;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Move choose gar:");
        System.out.println("0.Scissors");
        System.out.println("1.Paper");
        System.out.println("2.Rock");

        Random random=new Random();
        computerMove=random.nextInt(3); //0,1,2

        System.out.println("Enter your move pls:");
        userMove=scanner.nextInt();

        switch(userMove){
            case 0:
            System.out.println("User chose Scissors");
            break;
            case 1:
            System.out.println("User chose Paper");
            break;
            case 2:
            System.out.println("User chose Rock");
            break;
 }

        switch(computerMove){
            case 0:
            System.out.println("Computer chose Scissors");
            break;
            case 1:
            System.out.println("Computer chose Paper");
            break;
            case 2:
            System.out.println("Computer chose Rock");
            break;
 }

        if(computerMove==userMove){
            System.out.println("OII same move");
        }
        else if((computerMove==0&&userMove==1 )|| (computerMove==1&&userMove==2) || (computerMove==2&&userMove==0)){  //brackets pls
            System.out.println("Computer wins nanananana");
        }
        else{
            System.out.println("USER WONNN FUCK YES");
        }

    }
}
    

