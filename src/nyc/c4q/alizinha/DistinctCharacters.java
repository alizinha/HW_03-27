package nyc.c4q.alizinha;

import java.util.Scanner;

/**
 * Done during Monday office hours, with input from Sarah, John G., Alvin.
 */
public class DistinctCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or sentence");
        String string = input.nextLine();
        System.out.println(uniqueCharacters(string));

    }

    public static String uniqueCharacters (String string) {
        String lowerString = string.toLowerCase();
        String distinctCharacters = "" + lowerString.charAt(0);
        for (int i = 1; i < lowerString.length(); i++) {
            String checkLetter = lowerString.substring(i, i + 1);
            if (distinctCharacters.contains(checkLetter)) {
                continue;
            } else {
                distinctCharacters = distinctCharacters + lowerString.charAt(i);
            }
        }
        return distinctCharacters;

    }
}
