package Assignment1;
import java.util.Scanner;

class Grade {
    public static void main(String[] args) {
        
        System.out.print("Enter the marks : ");

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        sc.close();

        if(marks >= 85 && marks<=100){
            System.out.println(" Student has A grade.");
        } else if(marks >= 75 && marks<=85){
            System.out.println(" Student has B grade.");
        } else if(marks >= 60 && marks<=75){
            System.out.println(" Student has C grade.");
        } else if(marks >= 40 && marks<=60){
            System.out.println(" Student has D grade.");
        } else {
            System.out.println(" Student has passed without grades.");
        }


    }
    
}
