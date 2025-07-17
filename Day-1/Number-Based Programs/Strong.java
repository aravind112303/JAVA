public class Strong {
    public static int Fact(int n) {
        int fact=1;
        for(int i=1;i<=n;i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int num=145,original=num, sum=0;
        while(num >0) {
            int digit =num%10;
            sum += Fact(digit);
            num = num/10;
        }
        if(sum==original) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }
    }
}