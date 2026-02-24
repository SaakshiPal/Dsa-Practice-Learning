import java.util.*;

public class pro_25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size= sc.nextInt();
        String name[]= new String[size];
        System.out.print("Enter the name of students: ");
        for(int i=0;i<size;i++){
            name[i]=sc.next();
        }
        System.out.println("The name of the students are: ");
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
        sc.close();
    }
}
