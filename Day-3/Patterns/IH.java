class IH {
    public static void main(String[] args) {
        for (int line = 1; line <= 4; line++) {
             for(int space = 1; space <=4-line; space++) {
                System.out.print(" ");
             }
            for(int star = 1; star<=line; star++) {
                System.out.print("*");
            }
            System.out.println();
     }
    }
}