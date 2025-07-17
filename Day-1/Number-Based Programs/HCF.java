public class HCF {
    public static void main(String[] args) {
        int a=60,b=48,temp;
        while(b!=0) {
            temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("HCF:"+a);
    }
}