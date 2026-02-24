import java.util.*;

public class pro_24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size= sc.nextInt();
        int[] arr= new int[size];
        System.out.print("Enter the elements of array: ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
