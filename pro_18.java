import java.util.*;

public class pro_18 {
    
    public static void printoddsum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("The Sum of odd number from 1 to "+n+" is: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Range till you need sum of odd no: ");
        int num=sc.nextInt();
        printoddsum(num);
        sc.close();
    }
}
