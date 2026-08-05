class ArrayDemo {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        double average;

        System.out.println("Array Elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        average = (double) sum / arr.length;

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);
    }
}