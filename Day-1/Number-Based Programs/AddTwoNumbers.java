import java.util.Scanner;

class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first digit:");
        int a=sc.nextInt();
        System.out.print("Enter second digit:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.print("The sum of two nums:"+c);
    }
}