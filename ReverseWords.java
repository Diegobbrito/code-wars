public class ReverseWords {
    public static String reverseWords(final String original)
    {
        if(original.matches("\\s+")){
            return original;
        }
        var result = "";
        for (String s: original.split(" ") ) {
            result += new StringBuilder(s).reverse().toString();
            result += " ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("      "));
    }
}
