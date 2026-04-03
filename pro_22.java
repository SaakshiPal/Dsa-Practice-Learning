import java.util.*;

public class pro_22 {
    public static int calculateLCM(int a, int b) {
        int max= Math.max(a,b);
        while(true){
            if(max%a==0 && max%b==0){
                return max;
            }
            max++;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first no: ");
        int num1= sc.nextInt();
        System.out.print("Enter the second no: ");
        int num2= sc.nextInt();
        int result= calculateLCM(num1, num2);
        System.out.println("The LCM of "+num1+" and "+num2+" is: "+ result);
        sc.close();

    }
}
