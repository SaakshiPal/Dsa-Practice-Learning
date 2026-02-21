import java.util.*;
public class pro_2 {
    public static void main(String[] args) {
       //To find the radius and area of circle
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter the circumference of circle: ");
       double circumferance= sc.nextDouble();
       double radius= circumferance/(2*3.14);
       System.out.println("The radius of circle is: "+radius);
       double area= 3.14*radius*radius;
       System.out.println("The area of circle is: "+area);
       sc.close();
    
    }
}
