import java.util.*;

public class pro_26 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size= sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the element of Array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum element in the array is: "+max);
        System.out.println("The minimum elemnt in the array is: "+min);
        sc.close();

        
    }
}
