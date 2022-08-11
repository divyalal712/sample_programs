package sample;

public class FibonacciStairs {

    public static void main(String[] args) {

        System.out.println(countWays(1000));
    }

    /**
     * This method is used to calculate the no of distinct ways to climb a stair case by making steps of either 1 or 2.
     * @param numberOfSteps the number of steps in a staircase
     * @return the number of ways in which the stair case can be climbed.
     */
    private static int countWays(int numberOfSteps) {

        int first = 1;
        int second = 2;

        if (numberOfSteps < 3 ) {
            return numberOfSteps;
        }

        for (int i = 3; i <= numberOfSteps; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
