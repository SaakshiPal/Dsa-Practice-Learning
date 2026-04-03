import java.util.Scanner;

public class pro_1 {
    public static void main(String[] args) {
        //This is a simple table useing multiple print statements
        Scanner sc= new Scanner(System.in);
        System.out.print("Input a number of which table want to print: ");
        int n= sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println( n + " x "+i+" = "+ n*i);
        }
        sc.close();
        System.out.println();
    
    }
    
}
