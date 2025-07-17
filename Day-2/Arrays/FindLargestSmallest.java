public class FindLargestSmallest {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60};
        int lg = arr[0];
        int sm = arr[0];

        for(int i=0;i<arr.length;i++) {
            if(arr[i] > lg) {
                lg = arr[i];
            }
            if(arr[i]< sm) {
                sm = arr[i];
            }
        
        }
        System.out.println("Largest:"+lg);
        System.out.println("Smallest:"+sm);

    }
}