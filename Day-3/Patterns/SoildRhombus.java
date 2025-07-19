public class SoildRhombus {
    public static void main(String[] args) {
        for (int line = 1; line <= 5; line++) {
             for(int space = 1; space <=5-line; space++) {
                System.out.print(" ");
             }
            for(int star = 1; star<=5; star++) {
                System.out.print("*");
            }
            System.out.println();
     }
    }
}