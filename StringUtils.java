package gr.aueb.cf.oopProjects;

public class StringUtils {


    private StringUtils() {

    }

    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }


    public static String toUpperCase(String input) {
        if (input == null) {
            return null;
        }
        return input.toUpperCase();
    }



}
