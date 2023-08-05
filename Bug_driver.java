//********************************************************************
//  MoveBug.java
//  A prgram of moving bug
//********************************************************************
import java.util.Scanner;

public class Bug_driver
{
    public static void main(String[] args) {
        //create an object from Bug class
        Bug b1=new Bug();

        //prompt user to input commands
        Scanner scan = new Scanner (System.in);
        System.out.println("Instruct your bug (type output/move/turn/exit)");
        String str=scan.nextLine();

        //continue to prompt user if output,move,turn were select until exiting
        while (!str.equalsIgnoreCase("exit")){
            if (str.equalsIgnoreCase("output"))
                System.out.println(b1);
            else if (str.equalsIgnoreCase("move")){
                b1.move();
                System.out.println(b1);
            }
            else if (str.equalsIgnoreCase("turn")){
                b1.turn();
                System.out.println(b1);
            }
            else {
                System.out.println("Invalid input.");
            }
            System.out.println("Instruct your bug (type output/move/turn/exit)");
            str=scan.nextLine();
        }
        System.out.println("Bye!");
    }
}
