import java.util.Scanner;

public class GuessNo {
    public static void main(String[] args) {
        // Mini Project

        try (Scanner input = new Scanner(System.in)) {
            int mynumber=(int)(Math.random()*100);
            int usernumber=0;

            System.out.println("Press -1 to exit");
            System.out.println("Guess the Number");

            do {

                usernumber=input.nextInt();
                if(usernumber==-1)
                break;
                if(usernumber==mynumber)
                {
                    System.out.println("wooHoo ... you guessed the Correct Number -> " + usernumber);
                    break;
                }
                else if(usernumber>mynumber)
                {
                    System.out.println("Your number is too large");
                }
                else if(usernumber<mynumber)
                {
                    System.out.println("Your number is too small");
                }
                
            } while (usernumber>=0);
        }
    }
}
