class Main {
    public static int addLastDigits(int input1, int input2) {
        input1 = Math.abs(input1);
        input2 = Math.abs(input2);
        int lastDigit1 = input1 % 10;
        int lastDigit2 = input2 % 10;
        return lastDigit1 + lastDigit2;
    }
}
