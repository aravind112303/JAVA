public class Armstrong {
    public static void main(String[] args) {
        int num=153, rem, temp=num,p,sum=0;
        p=String.valueOf(num).length();
        while(num>0) {
            rem=num%10;
            sum = sum+ (int)Math.pow(rem, p);
            num=num/10;
        }
        if(temp==sum) {
            System.err.println("Armstrong number");
        } else {
            System.err.println("Not armstrong");
        }
    }
}