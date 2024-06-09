package gr.aueb.cf.oopProjects.chapter14HW;

import gr.aueb.cf.oopProjects.chapter14HW.ValidationUtils;

public class ValidationUtilsMain {
    public static void main(String[] args) {
        int num = 9;
        String example = "This string should not be less than 31 characters and always print false";

        System.out.println("The number is: " + ValidationUtils.validateNum(num));
        System.out.println(ValidationUtils.isStringLengthValid(example));
    }
}
