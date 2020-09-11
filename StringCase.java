import static org.junit.Assert.assertEquals;

public class StringCase {
    public static String solve(final String str) {
            int upper = (int) str.chars().filter((s)->Character.isUpperCase(s)).count();
            int lower = (int) str.chars().filter(Character::isLowerCase).count();

        return upper > lower ? str.toUpperCase() : str.toLowerCase();
    }

    public static void main(String[] args) {
        assertEquals("code", StringCase.solve("code"));
    }
}


