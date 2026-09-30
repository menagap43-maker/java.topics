//topic 1:input from the user
// 1.find the integer even or odd
/*import java.util.Scanner;
public class input {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("the number is:" );
        int num =scan.nextInt();
        if(num%2==0){
            System.out.print("even");
        }
        else{
            System.out.print("odd");
        }
    
}
}*/

//2.Create an integer variable called age and print it.
/*public class input{
    public static void main(String args[]){
    int age=18;
    System.out.print("my age is:" + age); 

    }
}*/

//3.Take two numbers from the user and print their sum.
 /*import java.util.Scanner;
 public class input{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the num1:");
        int a= scan.nextInt();
        System.out.print("enter the num2:");
        int b= scan.nextInt();
        int sum=a+b;
        System.out.print("the sum is:"+ sum);
    }
 }*/

// 4.Take two numbers and print their multiplication.
/*import java.util.Scanner;
public class input{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the num1:");
    int a= scan.nextInt();
    System.out.println("enter the num2:");
    int b=scan.nextInt();
    System.out.print("enter the num3:");
    int c=scan.nextInt();
    int d=a*b*c;
    System.out.print("the multiply number is:" + d);
    }
}*/

//5.Take a number and find its square.
import java.util.Scanner;
public class input{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the number:");
        int n = scan.nextInt();
        int square= n*n;
        System.out.print("the square number is:" + square);
        
    }

}
