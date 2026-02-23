import java.util.*;

public class pro_14 {
    
    public static void mulitiply(int a, int b){
        int m=a*b;
        System.out.println("Them multipication of " +a+ " and "+b+ " is: "+m);
    }   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the num-1: ");
        int num1= sc.nextInt();
        System.out.println("Enter the num-2: ");
        int num2= sc.nextInt();
        mulitiply(num1,num2);
        sc.close();
    }
}
