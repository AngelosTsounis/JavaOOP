package gr.aueb.cf.oopProjects;

public class ValidationUtils {

    private ValidationUtils() {

    }
    public static boolean validateNum(int num) {
        boolean check = false;
        if(num > 1 && num < 10) {
            return check = true;
        }
       return check;
    }

    public static boolean isStringLengthValid(String input) {
        if (input == null) {
            return false;
        }
        int length = input.length();
        return length >= 1 && length <= 31;
    }
}
