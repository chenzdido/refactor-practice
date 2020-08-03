package com.twu.refactoring;

public class NumberCruncher {
    private final int[] numbers;

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }

    public int[] count(){
        int[] count=new int[4];
        for (int number : numbers) {
            if (number % 2 == 0) {
                count[0]++;
            }else{
                count[1]++;
            }
            if (number >= 0) {
                count[2]++;
            }else{
                count[3]++;
            }
        }
        return count;
    }
    public int countEven() {
        int countEven=count()[0];
        return countEven;
    }

    public int countOdd() {
        int countOdd=count()[1];
        return countOdd;
    }

    public int countPositive() {
        int countPositive=count()[2];
        return countPositive;
    }

    public int countNegative() {
        int countNegative=count()[3];
        return countNegative;
    }
}
