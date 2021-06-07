//Program to find out the missing number from the given array
package Tricky_package;

public class find_missing_number {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10};

        System.out.println("The missing number is :: " + missingNumber(arr, 10));
    }

    /**
     * Method to find out the missing number form the array
     *
     * @param arr         is the array
     * @param numberCount is the count of the last (highest) number
     * @return the missing number
     */
    public static int missingNumber(int[] arr, int numberCount) {

        //calculating the total sum
        int totalSum = (numberCount * (numberCount + 1)) / 2;

        //calculating the actual sum
        int actualSum = 0;
        for (int ele : arr)
            actualSum += ele;

        //calculating the missing number and returning
        return totalSum - actualSum;
    }
}
