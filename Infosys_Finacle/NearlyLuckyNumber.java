/*
Kim finds the digits 3,4 & 7 to be licky digits. a number is called nearly lucky if the count of lucky digits in a number is also a lucku digit.

You are given N numbers, tell how many of them are nearly lucky?

*/



public class NearlyLuckyNumber {
    public static int nearlyLucky(int[] Arr) {
        int count = 0;
        for (int num : Arr) {
            if (isNearlyLucky(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isNearlyLucky(int num) {
        int luckyCount = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 3 || digit == 4 || digit == 7) {
                luckyCount++;
            }
            num /= 10;
        }
        return (luckyCount == 3 || luckyCount == 4 || luckyCount == 7);
    }

    public static void main(String[] args) {
        int[] arr = {347, 777, 123, 444, 741, 47, 39};
        System.out.println(nearlyLucky(arr)); // Output: count of nearly lucky numbers
    }
}
