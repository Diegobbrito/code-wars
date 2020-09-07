package MiddleCharacter;

public class MiddleCharacter {
    public static String getMiddle(String word) {
        //Code goes here!
        var result = "";
        var names = word.split(" ");
        for (String name : names) {
            result += name.substring(0,1).toUpperCase() + ".";
        }
        return result.substring(0,result.length()-1);
    }
}
