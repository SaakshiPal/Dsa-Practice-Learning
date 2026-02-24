import java.util.*;

public class pro_21 {
    public static int calculatewhichisGCD(int a, int b) {
        while (a!=b) {
            if (a>b) {
                a= a-b;
            }
            else{
                b= b-a;
            }
            
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first no: ");
        int num1= sc.nextInt();
        System.out.print("Enter the second no: ");
        int num2= sc.nextInt();
        int result = calculatewhichisGCD(num1, num2);
        System.out.println("The GCD of "+num1+" and "+num2+" is: "+ result);
        sc.close();
    }
}
