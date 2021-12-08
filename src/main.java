package src;
import java.util.Scanner;

public class main{
    public static void main(String[] args){
        System.out.println("Welcome to BFCIJ, Enter a number:   "); 
        Scanner sc = new Scanner(System.in);
        int fstNum = sc.nextInt();;
        System.out.println("Enter a second number:  ");
        int scndNum = sc.nextInt();;
        System.out.println("Enter an operation (/,*,+,-): ");
        String operation = sc.next();;

        switch(operation){
            case("/"):
                System.out.println("Here is the result of " + fstNum + " " + operation + " " + scndNum + ": " + fstNum/scndNum);
                break;

            case("*"):
                System.out.println("Here is the result of " + fstNum + " " + operation + " " + scndNum + ": " + fstNum*scndNum);
                break;

            case("+"):
                int resultAddition = fstNum+scndNum;
                System.out.println("Here is the result of " + fstNum + " " + operation + " " + scndNum + ": " + resultAddition);
                break;

            case("-"):
                int resultSubtraction = fstNum-scndNum;
                System.out.println("Here is the result of " + fstNum + " " + operation + " " + scndNum + ": " + resultSubtraction);
                break;

            default:
                System.out.println("Failed!");
                break;
        }
    }
}