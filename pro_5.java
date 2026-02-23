import java.util.*;
public class pro_5 {
    public static void main(String[] args) {
        //Pattern problem
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no of col: ");
        int col=sc.nextInt();
        System.out.print("Enter no of row: ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
