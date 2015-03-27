package nyc.c4q.alizinha;
import java.util.Scanner;

/**
 * Created by c4q-Allison on 3/23/15.
 */
public class JavaClasses {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String nameOne = input.nextLine();
        System.out.println("And you?");
        String nameTwo = input.nextLine();

        System.out.println(nameOne + ", where do you live?");
        String cityOne = input.nextLine();
        System.out.println("And you, " + nameTwo + "?");
        String cityTwo = input.nextLine();

        Person johnDoe = new Person();
        johnDoe.setName(nameOne);
        johnDoe.setCity(cityOne);

        Person janeDoe = new Person();
        janeDoe.setName(nameTwo);
        janeDoe.setCity(cityTwo);

        if (checkSameCity(johnDoe, janeDoe) == true) {
            System.out.println("You two live in the same city");
        } else {
            System.out.println("You two live in different cities");
        }

        System.out.println();

        System.out.println("Baby Registration");

        Person parent = new Person();

        parent.setPhoneNumber("(718) 123 - 6789");
        parent.setCity("New York City");

        registerChild(parent);

    }

    public static boolean checkSameCity (Person johnDoe, Person janeDoe) {
        if (johnDoe.getCity().equalsIgnoreCase(janeDoe.getCity())) {
            return true;
        } else {
            return false;
        }
    }

    public static Person registerChild (Person parent) {
        Person child = new Person();
        child.setName("Abc");
        System.out.println("Name: " + child.getName());
        System.out.println("Phone Number: " + parent.getPhoneNumber());
        System.out.println("City: " + parent.getCity());
        return child;
    }


}
