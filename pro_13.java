import java.util.*;
public class pro_13 {
    
    // function to calculate the sum of two numbers
    public static void sum(int a, int b){
        int sum= a+b;
        System.out.println("The sum of "+a+" and "+b+" is: "+sum);
    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the num-1: ");
       int num =sc.nextInt();
       System.out.println("Enter the num-2: ");
       int num_2=sc.nextInt();
       sum(num,num_2);
       sc.close();
    
    }
}
