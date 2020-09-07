package UpperCase;

public class JadenCase {

    public String toJadenCase(String phrase) {
        // TODO put your code below this comment


        String[] text =
        phrase.split(" ");
        var textFinal = "";
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].substring(0,1).toUpperCase() + text[i].substring(1);
            textFinal += text[i] + " ";
//            System.out.print(text[i]);
        }
        System.out.println(textFinal.trim());

        return null;
    }

}