public class Perfect {
    public static void main(String[] args) {
        int num=6,sum=0;
        for(int i=1;i<num;i++) {
            if(num%i ==0) {
                sum += i;
            }
        }
        if(sum==num) {
            System.err.println("Perfect number");
        } else {
            System.err.println("Not perfect");
        }
    }
}