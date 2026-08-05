class FactorialDemo {

    static void factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " = " + fact);
    }

    public static void main(String[] args) {
        FactorialDemo.factorial(5);
    }
}