import static org.junit.Assert.assertEquals;

public class BumpsInTheRoad {
    public static String bumps(final String road) {

//        if(road.length() < 16) return "Woohoo!";
//
//       int initialLength = road.length();
//
//       int finalLength = road.replaceAll("n", "").length();
//
//       System.out.println(road.length());
//       System.out.println(finalLength);
//       System.out.println(initialLength - finalLength);


        return road.replaceAll("_", "").length() < 16 ? "Woohoo!" : "Car Dead";
    }

    public static void main(String[] args) {
        assertEquals(BumpsInTheRoad.bumps("n"), "Woohoo!");
        assertEquals(BumpsInTheRoad.bumps("_nnnnnnn_n__n______nn__nn_nnn"), "Car Dead");
        assertEquals(BumpsInTheRoad.bumps("______n___n_"), "Woohoo!");
        assertEquals(BumpsInTheRoad.bumps("nnnnnnnnnnnnnnnnnnnnn"), "Car Dead");
    }
}
