package basic_practice_package;

public class P33_VarArgs {

    public static void main(String[] args) {

        printMax(34, 36, 4, 6, 89, 21);
        printMax(new double[]{1, 3, 6});
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No Arguments Passed :(");
            return;
        }

        double max = numbers[0];

        for (double ele : numbers) {
            if (ele > max)
                max = ele;
        }
        System.out.println("Max is :: " + max);
    }
}
