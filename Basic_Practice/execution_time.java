package basic_package;

/*
(Execution time) Write a program that randomly generates an basic_package.array of 100,000
integers and a key. Estimate the execution time of invoking the linearSearch
method in Listing 7.6. Sort the basic_package.array and estimate the execution time of invoking the binarySearch method in Listing 7.7. You can use the following code
template to obtain the execution time:
long startTime = System.currentTimeMillis();
perform the task;
long endTime = System.currentTimeMillis();
long executionTime = endTime - startTime;

 */
public class execution_time {

    public static void main(String[] args) {

        int[] arr = new int[100002]; // creating basic_package.array

        for (int i = 0; i < 100001; i++) // initializing the basic_package.array with random numbers
            arr[i] = (int) (Math.random() * 1000000);

        for (int i = 0; i < 100001; i++) {
            System.out.print(arr[i] + "  "); // printing basic_package.array in block of 100
            if (i % 100 == 0)
                System.out.println();
        }

        int key = (int) (Math.random() * 1000000); // generating key for performing the searches

        long startTime = System.currentTimeMillis(); // recording the start time
        linearSearch(arr, key);
        long endTime = System.currentTimeMillis();
        long executionTimeOfLearner = endTime - startTime;
        System.out.println("Execution time of linear search is :: " + executionTimeOfLearner);

        long startTimeBinary = System.currentTimeMillis(); // recording the start time
        binarySearch(arr, 100002, key);
        long endTimeBinary = System.currentTimeMillis();
        long executionTimeOfBinary = endTimeBinary - startTimeBinary;
        System.out.println("Execution time of linear search is :: " + executionTimeOfBinary);
    }

    public static void binarySearch(int[] arr, int n, int key) {
        int low = 0;
        int high = n - 1;
        boolean found = false;

        int i;
        for (i = 0; i < n && !found; i++) {

            int mid = (low + high) / 2;

            if (key == arr[mid])
                found = true;
            else if (key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        if (!found)
            System.out.println(key + " not present in the basic_package.array :(");
        else
            System.out.println(key + " is present in the basic_package.array :(");
    }

    public static void linearSearch(int[] arr, int key) {
        int i;
        boolean found = false;
        for (i = 0; i < arr.length && !found; i++) {
            if (arr[i] == key)
                found = true;
        }
        if (found)
            System.out.println(key + " Present at index " + i);
        else
            System.out.println(key + " Not present in the basic_package.array :(");
    }
}
