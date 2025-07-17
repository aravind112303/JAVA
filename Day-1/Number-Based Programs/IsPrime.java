
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        boolean IsPrime =true;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number:");
        int a=sc.nextInt();
        for(int i=2;i<a;i++) {
            if(a%i==0) {
            IsPrime = false;
            break;
            }
        }
        System.out.println(IsPrime?"Prime":"Not Prime");
    }
}