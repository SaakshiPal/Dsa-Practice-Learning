import java.util.*;

public class pro_20 {
    public static void main(String[] args) {
        int positive=0, negative=0, zero=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 for continue and 0 for stop: ");
        int size= sc.nextInt();
        while (size==1) {
            System.out.println("Enter the no: ");
            int num= sc.nextInt();
            if(num>0){
                positive++;
            }
            else if(num<0){
                negative++;
            }
            else{
                zero++;
            }
            System.out.println("Enter the 1 for continue and 0 for stop: ");
            size= sc.nextInt();
        }
        System.out.println("Positive numbers: "+positive);
        System.out.println("Negative numbers: "+negative);
        System.out.println("Zero numbers: "+zero);
        sc.close();
    }
}
