class Inverted_Halfpyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int line = n; line >= 1; line--) {
            for (int num = 1; num <= line; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
