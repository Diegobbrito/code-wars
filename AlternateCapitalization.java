import static org.junit.Assert.assertArrayEquals;

public class AlternateCapitalization {

    public static String[] capitalize(String s){
        // Gorillaz - Do Ya Thing (2010)
        var upper = "";
        var lower = "";
        for (int i = 0; i < s.length(); i++) {
            if (i% 2 == 0){
                upper += s.toUpperCase().charAt(i);
                lower += s.toLowerCase().charAt(i);
            }else {
                lower += s.toUpperCase().charAt(i);
                upper += s.toLowerCase().charAt(i);
            }
        }
        return new String[]{upper, lower};
    }


    public static void main(String[] args) {

        assertArrayEquals(new String[]{"AbCdEf", "aBcDeF"}, AlternateCapitalization.capitalize("abcdef"));
    }
}
