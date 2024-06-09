package gr.aueb.cf.oopProjects.chapter14HW;

public class MathHelper {


    private MathHelper() {}
    public static int findMax(int[] numbers) {
        int max = numbers[0];

        for(int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];

        for(int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int averageNum(int[] numbers) {
        int sum = 0;

        for(int number : numbers) {
             sum = sum + number;
        }
        return sum / numbers.length;
    }
}
