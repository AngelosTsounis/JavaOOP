package gr.aueb.cf.oopProjects.chapter12HW;

import gr.aueb.cf.oopProjects.chapter12HW.User;
import gr.aueb.cf.oopProjects.chapter12HW.UserCredentials;

public class UserMain {
    public static void main(String[] args) {

        User angel = new User(1,"Angel", "Tsounis");
        UserCredentials angelcredentials = new UserCredentials(1, "Sints","04081997");

        System.out.println("Id: " + angel.getId());
        System.out.println("firstname: " + angel.getFirstname());
        System.out.println("lastname: " + angel.getLastname());
        System.out.println("Username: " + angelcredentials.getUsername());
        System.out.println("Password: " + angelcredentials.getPassword());
    }
}
