import java.util.*;

public class pro_23 {
    
    public static int fibonacci(int num) {
        int a=0, b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2; i<num; i++){
            int c= a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = sc.nextInt();
        fibonacci(n);
        sc.close();
    }
    
}
