public class Factorial {
    public static void main(String[] args) {
        int num=5,sum=1,fact=1;
        for(int i=1;i<=num;i++) {
            sum *=fact*i;
        }
        System.err.println("Factorial:"+sum);
    }
}