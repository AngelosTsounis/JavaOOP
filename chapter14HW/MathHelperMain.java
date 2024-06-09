package gr.aueb.cf.oopProjects.chapter14HW;

import gr.aueb.cf.oopProjects.chapter14HW.MathHelper;

public class MathHelperMain {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 10, 8, 29, 30};

        System.out.println("Maximun: " + MathHelper.findMax(numbers));
        System.out.println("Minumum: " + MathHelper.findMin(numbers));
        System.out.println("Average: " + MathHelper.averageNum(numbers));
    }
}
