class Main {
    public static int countEvenOdd(int[] numbers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (isEven(num) == 2) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Return the count of even and odd numbers
        return evenCount * 10 + oddCount;
    }

    public static int isEven(int input) {
        if (input % 2 == 0) {
            return 2;  // Return 2 for even numbers
        } else {
            return 1;  // Return 1 for odd numbers
        }
    }
}
