package nyc.c4q.alizinha;

/**
 * Access Code 2.1
 + * Created by Jaellys Bales and Allison Bojarski on 3/25/15.
 * Project: HW_03-27
 *
 * CaesarCipher.java
 * Assignment: Write a function called codeBreaker, which accepts two cipher strings and returns a boolean value which tells us
 * whether they are actually the same input message encoded using two different offsets. Try multiple solutions.
 */

public class CaesarCipher {

    public static boolean codeBreaker(String cipher1, String cipher2) {
        boolean ifSame = false;

        // Iterating character by character, evaluating if char i in cipher1 is equal to char i in cipher 2.
        for (int i = 0; i <= 25; i++) {
            if (encode(cipher1, i).equals(cipher2)) {
                return true;
            }
        }

        return false;
    }

    public static String decode(String enc, int offset) {
        return encode(enc, 26-offset);
    }

    public static String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

    public static void main(String[] args) {
//To test that it would return "false" if the strings are different, I changed cipher2 to "abcdf" while leaving the rest
//the same and it did return a "false".
        String cipher1 = CaesarCipher.encode("abcde", 5);
        String cipher2 = CaesarCipher.encode("abcde", 8);

        System.out.println(codeBreaker(cipher1, cipher2));
    }
//Jae and I only came up with one solution because it took us so long to get this one solution done successfully.

}
