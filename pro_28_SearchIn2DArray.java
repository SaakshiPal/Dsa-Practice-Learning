import java.util.*;

public class pro_28_SearchIn2DArray {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of rows and columns: ");
       int rows = sc.nextInt();
       int cols = sc.nextInt();


       int[][] numbers = new int[rows][cols];


       //input
       //rows
       System.out.println("Enter the elements of the array: ");
       for(int i=0; i<rows; i++) {
           //columns
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }
       System.out.print("Enter the element to search: ");
       int x = sc.nextInt();


       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
               //compare with x
               if(numbers[i][j] == x) {
                   System.out.println("x found at location (" + i + ", " + j + ")");
               }
           }
       }
       sc.close();
    }
}
