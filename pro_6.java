import java.util.*;
public class pro_6 {
    public static void main(String[] args) {
        //Patten problem
        // * * * * *
        // *       *
        // *       *
        // * * * * *
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no of col: ");
        int col=sc.nextInt();
        System.out.print("Enter no of row: ");
        int row=sc.nextInt();
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                if (i==0 || i==col-1 || j==0 || j==row-1){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                    
                }
            }
            System.out.println();
        }
        sc.close();

    }
}
