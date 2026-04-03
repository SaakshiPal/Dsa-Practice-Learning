import java.util.*;

public class pro_15 {
    
    public static void factorialnum(int a){
        if(a<=0){
            System.out.println("Invalid number");
        }
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of "+a+" is: "+fact);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        factorialnum(num);
        sc.close();
    }
}
