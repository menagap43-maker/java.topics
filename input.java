//topic 1:input from the user
// 1.find the integer even or odd
import java.util.Scanner;
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
}