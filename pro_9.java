import java.util.*;
public class pro_9 {
    public static void main(String[] args) {

        //Pattern problem
        //    *
        //   **
        //  ***
        // ****
        //*****

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the row no: ");
        int row= sc.nextInt();
        for(int i=row;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=row-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
