package classwork.Fibonacci07022025;

class calculateradius {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
    public static void main(String[] args){
        for (int i = 1; i <= 5; i++) {
            calculateradius calculateRadius = new calculateradius();
            System.out.println(calculateRadius.factorial(i));
        }
    }

}






