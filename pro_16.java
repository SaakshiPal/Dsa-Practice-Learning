import java.util.*;
public class pro_16 {
    
    public static void table(int a) {
        for(int i=1;i<=10;i++){
            System.out.println(a+" X "+i+" = "+a*i);

        }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no of which you need table : ");
        int num= sc.nextInt();
        System.out.println("Table of "+num+" is: ");
        table(num);
        sc.close();
    }
}
