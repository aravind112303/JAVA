public class LCM {
    public static int hcf(int a,int b) {
        while(b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a=12,b=8;
        int hcfValue=hcf(a,b);
        int lcm = (a*b) / hcfValue;
        System.out.println("LCM:"+lcm);
    }
}