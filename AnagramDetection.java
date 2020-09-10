import java.util.Arrays;

import static org.junit.Assert.*;
public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {

        char[] firstString = test.toLowerCase().toCharArray();
        char[] secondString = original.toLowerCase().toCharArray();

        Arrays.sort(firstString);
        Arrays.sort(secondString);

        return Arrays.equals(firstString, secondString);
    }

    public static void main(String[] args) {
        AnagramDetection k = new AnagramDetection();
        assertEquals(true, k.isAnagram("foefet", "toffee"));
    }
}
