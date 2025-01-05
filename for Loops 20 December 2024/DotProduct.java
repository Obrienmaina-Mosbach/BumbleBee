public class DotProduct {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {4, 5, 6};

        int DotProduct = 0;

        for (int i = 0; i <A.length; i++) {
            DotProduct += A[i] * B[i];
        }
        
        System.out.println("Dot product: " + DotProduct);
    }
}