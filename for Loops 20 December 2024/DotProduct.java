public class DotProduct {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {4, 5, 6};

        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result += A[i] * B[i];
        }

        System.out.println("Dot product: " + result);
    }
}