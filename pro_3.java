import java.util.*;
public class pro_3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //To perform basic calculator operations
       System.out.print("Enter the operator which need to perform(+,-,/,%,*): ");
       char operator= sc.next().charAt(0);
       System.out.println("Enter the first number: ");
       double num1=sc.nextDouble();
       System.out.println("Enter the second the second number: ");
       double num2=sc.nextDouble();
       double result;
       switch  (operator){
           case '+':
               result= num1+num2;
               System.out.println("The sum of the two number is: " +result);
               break;
           case '-':
               result= num1-num2;
               System.out.println("The difference of the two number is: " +result);
               break;
           case '*':
               result= num1*num2;
               System.out.println("The product of the two number is: " +result);
               break;
           case '/':
               result= num1/num2;
               System.out.println("The division of the two number is: " +result);
               break;
           case '%':
               result= num1%num2;
               System.out.println("The remainder of the two number is: " +result);
               break;
           
        default:
            System.out.println("Invalid operator");
            break;
       }
       sc.close();
     
    }   
}
