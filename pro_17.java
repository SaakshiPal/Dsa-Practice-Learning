import java.util.*;

public class pro_17 {
    
    public static void avg(int a, int b, int c) {
        double average=(a+b+c)/3.0;
        System.out.println("The average of " + a + ", "+ b + " and " +c+ " is: "+average);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the three number to calculate the Average: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();  
        int num3=sc.nextInt();
        avg(num1,num2,num3);
        sc.close();

    }
}
