class Main {
    public static int countEvenNumbers(int input1, int input2, int input3, int input4, int input5) {
        int count = 0;
        
        // Check each number if it's even using modulo operator
        if (input1 % 2 == 0) {
            count++;
        }
        if (input2 % 2 == 0) {
            count++;
        }
        if (input3 % 2 == 0) {
            count++;
        }
        if (input4 % 2 == 0) {
            count++;
        }
        if (input5 % 2 == 0) {
            count++;
        }
        
        return count;
    }
}
