public class Palindrome {
    public static void main(String[] args) {
        int num=121, rev=0, temp=num;
        while(temp != 0) {
            int digit = temp%10;
            rev=rev*10+digit;
            temp /= 10;
        }
        if(num==rev) {
            System.out.println("Palindrome");
        }else
        System.err.println("Not palindrome");
    }
}