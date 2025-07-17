public class SumOfDigits {
    public static void main(String[] args) {
        int num=1234,temp,rev=0;
        while(num>0) {
        temp = num%10;
        rev +=temp;
        num = num/10;
        }
        System.out.println(rev);
    }
}