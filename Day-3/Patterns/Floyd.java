public class Floyd {
    public static void main(String[] args) {
        int n=1;
        for(int line=1; line<=5; line++) {
            for(int l=1;l<=line; l++) {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}