import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class FormTheLargest {
    public static long maxNumber(long n) {
        String input = String.valueOf(n);
        char tempArray[] = input.toCharArray();
        Arrays.sort(tempArray);
        String result = "";
        for (int k = input.length() - 1; k >= 0; k--) {
            result += tempArray[k];
        }
        return  Long.parseLong(result);
    }

    public static void main(String[] args) {
        assertEquals(  321, FormTheLargest.maxNumber(  213));
        assertEquals( 9873, FormTheLargest.maxNumber( 7389));
        assertEquals(97632, FormTheLargest.maxNumber(63792));
    }
}
