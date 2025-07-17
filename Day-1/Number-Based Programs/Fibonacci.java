public class Fibonacci {
    public static void main(String[] args) {
        int first=0, second=1,num=10,next;
        System.out.println(first);
        System.out.println(second);
        for(int i=1;i<num-2;i++) {
            next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
}