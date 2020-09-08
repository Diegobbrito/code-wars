public class ShortestWord {
    public static int findShort(String s) {
        var allStrings = s.split(" ");
        var menor = allStrings[0].length();
        for (String str : allStrings) {
            if( str.length() < menor){
                menor = str.length();
            }
        }
        return menor;
    }
}
