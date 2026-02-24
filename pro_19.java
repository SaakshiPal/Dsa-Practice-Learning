import java.util.*;

public class pro_19 {
    
    public static int powerno(int x, int n) {
        int result=1;
        for(int i=1; i<=n; i++){
            result*=x;
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the x value: ");
        int x= sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n= sc.nextInt();
        int res= powerno(x,n);
        System.out.println(x+" raised to the power "+n+" is: "+res);
        sc.close();
    }
}
