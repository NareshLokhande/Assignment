package Assignment1;
import java.util.Scanner;

public class Operations {

    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Number 1 : ");
    int num1 = sc.nextInt();

    System.out.print("Enter Number 2 : ");
    int num2 = sc.nextInt();

    System.out.print("Select Operator : ");
    char opr = sc.next().charAt(0);

    sc.close();


    switch (opr){

        case '+' : int sum=num1+num2;
        System.out.println(sum + " is the sum of two numbers provided");
        break;
        case '-': int sub=num1-num2;
        System.out.println(sub + " is the sum of two numbers provided");
        break;
        case '*': int mul=num1*num2;
        System.out.println(mul + " is the multiplication of two numbers provided");
        break;
        case '/': int div=num1/num2;
        System.out.println(div + " is the division of two numbers provided");
        break;
        default :System.out.println(" Invalid Input");
        break;
    }
    }

}
